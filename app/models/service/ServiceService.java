package models.service;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import models.Service;
import models.dao.ServiceDAO;

public class ServiceService {


    public static Service find(String serviceID) { return ServiceDAO.find(serviceID); }
}
