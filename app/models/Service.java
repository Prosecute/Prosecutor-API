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
import java.util.List;

@Entity
public class Service {
    public static String TABLE = Service.class.getSimpleName();

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer id;

    @OneToMany
    public List<Minimalist> minimalists;

    @Constraints.Required
    public String serviceID;

    @Constraints.Required
    public String secretKey;

    @OneToMany
    public List<Token> tokens;

    @Override
    public String toString() {
        return id+"";
    }
}
