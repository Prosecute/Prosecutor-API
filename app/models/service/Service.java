package models.service;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import play.mvc.Http;

public abstract class Service {

    protected static Service getCtxService()
    {
        return (Service) Http.Context.current().args.get("service");
    }
}
