package models;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import play.data.validation.Constraints;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ServiceAccess {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer id;


    @Constraints.Required
    public String secretKey;
}
