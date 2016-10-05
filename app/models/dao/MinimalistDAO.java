package models.dao;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Minimalist;
import models.Service;
import play.db.jpa.JPA;
import static models.JpaHelper.*;

import javax.persistence.TypedQuery;
import java.util.List;

public class MinimalistDAO {

    public static Minimalist create(Minimalist object,Service service)
    {
        object.service=service;
        object.service_id=service.id;
        Integer id=lastId(service);
        if(id==null)
            id=0;
        else
            id++;
        object.id=id;
        JPA.em().persist(object);
        JPA.em().flush();
        JPA.em().refresh(object);
        return object;
    }
    public static Integer lastId(Service service)
    {
        final String q= "SELECT m FROM "+Minimalist.TABLE+" m WHERE m.service_id=:service_id ORDER BY m.minimalist_id desc";
        TypedQuery<Minimalist> query=JPA.em().createNamedQuery(q,Minimalist.class);
        query.setParameter("service_id",service.id);
        List<Minimalist> list=query.setMaxResults(1).getResultList();
        if(list==null || list.size()==0)
            return null;
        return list.get(0).id;
    }

    public static Minimalist get(Integer id,Service service)
    {
        final String q= "SELECT m FROM "+Minimalist.TABLE+" m WHERE m.service_id=:service_id AND m.minimalist_id=:minimalist_id";
        TypedQuery<Minimalist> query=JPA.em().createNamedQuery(q,Minimalist.class);
        query.setParameter("service_id",service.id);
        query.setParameter("minimalist_id",id);
        return getSingleResultOrNull(query);
    }

    public static void remove(Minimalist minimalist)
    {
        JPA.em().remove(minimalist);
        JPA.em().flush();

    }
}
