package models.dao;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Service;
import play.db.jpa.JPA;

import javax.persistence.TypedQuery;

public class ServiceDAO {

    public static Service create(Service model)
    {
        model.id=null;
        model.secretKey=null;
        JPA.em().persist(model);
        JPA.em().flush();
        JPA.em().refresh(model);
        return model;
    }

    public static Service find(String serviceID)
    {
        final String q="Select m FROM "+Service.TABLE+" m WHERE m.serviceID= :serviceID";
        TypedQuery<Service> query=JPA.em().createQuery(q,Service.class);
        query.setParameter("serviceID",serviceID);
        return query.getSingleResult();
    }
}
