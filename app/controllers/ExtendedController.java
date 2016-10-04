package controllers;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import models.Service;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public abstract class ExtendedController extends Controller{

    protected Result jsonResult(Result httpResponse) {
        response().setContentType("application/json; charset=utf-8");
        return httpResponse;
    }
    protected Result xmlResult(Result httpResponse) {
        response().setContentType("application/xml; charset=utf-8");
        return httpResponse;
    }
    protected Result ok200(Class clazz,Object object)
    {
        if(ctx().request().accepts("application/xml"))
            try {
                return xmlResult(ok(toXML(clazz,object)));
            } catch (JAXBException e) {
                return internalServerError();
            }
        if(ctx().request().accepts("application/xml"))
            return jsonResult(ok(toJson(object)));
        return ok(object.toString());
    }

    protected Service getCtxService()
    {
        return (Service)ctx().args.get("service");
    }

    protected JsonNode toJson(Object object)
    {
        return Json.toJson(object);
    }
    protected String toXML(Class clazz,Object object) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(object, sw);
        return sw.toString();
    }


}
