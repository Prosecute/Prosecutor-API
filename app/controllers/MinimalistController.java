package controllers;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

public class MinimalistController extends ExtendedController {

    @Transactional(readOnly = true)
    public Result list()
    {

    }
    @Transactional(readOnly = false)
    public Result create()
    {

    }

    @Transactional(readOnly = true)
    public Result get(Integer id)
    {

    }
    @Transactional(readOnly = false)
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
