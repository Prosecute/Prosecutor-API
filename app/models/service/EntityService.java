package models.service;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Entity;
import models.dao.EntityDAO;

import java.nio.file.Path;

public class EntityService extends Service {

    public static Entity create(Entity entity)
    {
        entity.service=getCtxService();
        entity.service_id=getCtxService().id;
        return EntityDAO.create(entity);
    }
}
