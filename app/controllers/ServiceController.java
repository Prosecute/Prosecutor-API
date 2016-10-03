package controllers;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Service;
import models.Token;
import models.service.ServiceService;
import models.service.TokenService;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Result;

public class ServiceController  extends ExtendedController {


    public Result token()
    {
        DynamicForm form= Form.form().bindFromRequest();
        Service service=ServiceService.find(form.get("serviceID"));
        if(service.secretKey.equals(form.get("secretKey")))
        {
            return jsonResult(ok(TokenService.createToken(service)));
        }
        return unauthorized();
    }


}
