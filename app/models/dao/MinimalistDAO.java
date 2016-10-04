package models.dao;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Minimalist;
import play.db.jpa.JPA;

import java.util.List;

public class MinimalistDAO {

    public static Minimalist create(Minimalist object)
    {
        JPA.em().persist(object);
        JPA.em().flush();
        JPA.em().refresh(object);
        return object;
    }
    public static Minimalist get(Integer id)
    {
        return JPA.em().find(Minimalist.class,id);
    }
}
