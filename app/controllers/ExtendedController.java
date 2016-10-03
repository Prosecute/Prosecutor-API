package controllers;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import play.mvc.Controller;
import play.mvc.Result;

public abstract class ExtendedController extends Controller{

    protected Result jsonResult(Result httpResponse) {
        response().setContentType("application/json; charset=utf-8");
        return httpResponse;
    }
    protected Result xmlResult(Result httpResponse) {
        response().setContentType("application/xml; charset=utf-8");
        return httpResponse;
    }

    protected Integer serviceTableID()
    {
        return (Integer)ctx().args.get("serviceTableID");
    }
}
