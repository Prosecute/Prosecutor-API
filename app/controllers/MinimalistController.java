package controllers;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Entity;
import models.Enums;
import models.Minimalist;
import models.service.EntityService;
import models.service.MinimalistService;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import security.Authorize;

import java.nio.file.Path;

public class MinimalistController extends ExtendedController {

    @Transactional(readOnly = true)
    @Authorize("minimalist.read")
    public Result list()
    {
        return ok200(Minimalist.MinimalistList.class,new Minimalist.MinimalistList(getCtxService().minimalists));
    }
    @Transactional(readOnly = false)
    @Authorize("minimalist.write")
    public Result create()
    {
        Minimalist minimalist=new Minimalist();
        minimalist.service=getCtxService();
        minimalist.type= Enums.TrialName.Java;
        minimalist=MinimalistService.create(minimalist);
        return ok200(Minimalist.class,minimalist);
    }

    @Transactional(readOnly = true)
    @Authorize("minimalist.read")
    public Result get(Integer id)
    {
        Minimalist minimalist=MinimalistService.get(id);
        if(minimalist!=null)
            return ok200(Minimalist.class,minimalist);
        else
            return notFound();
    }
    @Transactional(readOnly = false)
    @Authorize("minimalist.write")
    public Result delete(Integer id)
    {
        Minimalist minimalist=MinimalistService.get(id);
        if(minimalist==null)
            return notFound();
        MinimalistService.remove(minimalist);
    }

    public Result uploadEntity(Integer id)
    {
        Minimalist minimalist=MinimalistService.get(id);
        if(minimalist==null)
            return notFound();
        Http.MultipartFormData md=request().body().asMultipartFormData();
        Entity entity=new Entity();
        EntityService.create(entity);
        Path path=MinimalistService.getLocalStorage(entity,minimalist);
        for(Http.MultipartFormData.FilePart file:md.getFiles())
        {
            Path p=path.resolve(file.getFilename());
            file.getFile().renameTo(p.toFile());
        }
        return ok200(Entity.class,entity);
    }

    public Result listEntities(Integer id)
    {

    }

    public Result getEntity(Integer id, Integer entityID)
    {

    }

    public Result createEntity(Integer id)
    {

    }
    public Result removeEntity(Integer id, Integer entityID)
    {

    }
    public Result addFile(Integer id, Integer entityID)
    {

    }
    public Result addFiles(Integer id, Integer entityID)
    {

    }
    public Result removeFile(Integer id, Integer entityID, String filename)
    {

    }

    public Result compareAgainst(Integer id, Integer againstID)
    {

    }
    public Result removeCompareAgainst(Integer id, Integer againstID)
    {

    }

    public Result run(Integer id)
    {

    }
    public Result runSync(Integer id)
    {

    }
    public Result runWithCallback(Integer id)
    {

    }
    public Result report(Integer id)
    {

    }

}
