package models.dao;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Token;
import play.db.jpa.JPA;

import javax.persistence.TypedQuery;
import java.sql.Timestamp;
import java.util.Calendar;

public class TokenDAO {

    public static Token createToken(Token token)
    {
        JPA.em().persist(token);
        JPA.em().flush();
        JPA.em().refresh(token);
        return token;
    }
    public static Token find(String access_token)
    {
        Token token=JPA.em().find(Token.class,access_token);
        if(token.expireDate.before(new Timestamp(Calendar.getInstance().getTime().getTime())))
        {
            clearExpired();
            return null;
        }
        return token;
    }

    public static void clearExpired()
    {
        final String q = "SELECT t FROM "+Token.TABLE+" t WHERE t.EXPIRE_DATE<:now";
        TypedQuery<Token> query= JPA.em().createQuery(q,Token.class);
        query.setParameter("now", new Timestamp(Calendar.getInstance().getTime().getTime()));
        query.getResultList().forEach(token -> {
            JPA.em().remove(token);
        });
    }
}
