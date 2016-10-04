package models.service;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Minimalist;
import models.dao.MinimalistDAO;
import play.mvc.Http;

public class MinimalistService extends Service {

    public static Minimalist create(Minimalist minimalist)
    {
        return MinimalistDAO.create(minimalist);
    }
    public static Minimalist get(Integer id)
    {
        Minimalist minimalist = MinimalistDAO.get(id);
        if(minimalist.service.id==getCtxService().id)
    }
}
