package security;///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Token;
import models.service.TokenService;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import security.Authorize;

public class AuthorizeAction extends Action<Authorize> {

    @Override
    public F.Promise<Result> call(Http.Context ctx) throws Throwable {
        String token=ctx._requestHeader().headers().get("Authorization").get();
        if(token==null )
            return F.Promise.pure(unauthorized());
        token=token.trim();
        if(!token.startsWith("Bearer "))
            return F.Promise.pure(unauthorized());
        else
            token=token.substring(7);
        Token tokenModel= TokenService.get(token);
        if(tokenModel==null)
            return F.Promise.pure(unauthorized());
        ctx.args.put("service",tokenModel.service);
        return delegate.call(ctx);
    }
}
