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
import models.Minimalist;
import models.dao.MinimalistDAO;
import play.mvc.Http;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MinimalistService extends Service {

    public static Minimalist create(Minimalist minimalist)
    {
        return MinimalistDAO.create(minimalist,getCtxService());
    }
    public static Minimalist get(Integer id)
    {
        Minimalist minimalist = MinimalistDAO.get(id,getCtxService());
        if(minimalist.service.id==getCtxService().id)
            return minimalist;
        return null;
    }
    public static void remove(Minimalist minimalist)
    {
        if(minimalist.service.id==getCtxService().id)
            MinimalistDAO.remove(minimalist);
    }

    public static Path getLocalStorage(Minimalist minimalist)
    {
        File file=new File("storage/minimalist/"+minimalist.service_id+"/"+minimalist.id+"/");
        file.mkdirs();
        return file.toPath();
    }
    public static Path getLocalStorage(Entity entity,Minimalist minimalist)
    {
        File file=new File("storage/minimalist/"+minimalist.service_id+"/"+minimalist.id+"/"+entity.id+"/");
        file.mkdirs();
        return file.toPath();
    }
}
