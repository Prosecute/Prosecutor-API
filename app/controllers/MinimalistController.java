package controllers;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Enums;
import models.Minimalist;
import models.service.MinimalistService;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import security.Authorize;

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
        return ok200(Minimalist.class,MinimalistService.get(id));
    }
    @Transactional(readOnly = false)
    @Authorize("minimalist.write")
    public Result remove(Integer id)
    {

    }

    public Result uploadEntity(Integer id)
    {

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
