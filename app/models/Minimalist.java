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

import javax.persistence.*;

@Entity
public class Minimalist {

    public static String TABLE = Employee.class.getSimpleName();

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer id;

    @Constraints.MaxLength(255)
    public String name;

    @Enumerated(EnumType.STRING)
    public Enums.TrialName type;
}
