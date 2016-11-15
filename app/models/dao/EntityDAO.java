package models.dao;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Entity;
import models.Service;
import play.db.jpa.JPA;

import java.util.List;

public class EntityDAO {


    public static Entity create(Entity entity)
    {
        JPA.em().persist(entity);
        JPA.em().flush();
        JPA.em().refresh(entity);
        return entity;
    }

    public static List<Entity> list(Service service)
    {
        return null;
    }
}
