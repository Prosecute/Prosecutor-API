package models.service;
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
import models.dao.TokenDAO;
import security.SecurityBackend;

import java.sql.Timestamp;
import java.util.Calendar;

public class TokenService {

    public static Token createToken(Service service)
    {
        Token token = new Token();
        token.access_token=SecurityBackend.generateToken(service.serviceID,service.secretKey);
        token.expireDate=new Timestamp(Calendar.getInstance().getTime().getTime()+4600000);
        TokenDAO.createToken(token);
        return token;
    }
    public static Token get(String access_token)
    {
        return TokenDAO.find(access_token);
    }
}
