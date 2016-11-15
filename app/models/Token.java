package models;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
public class Token {
    public static String TABLE = Token.class.getSimpleName();

    @Id
    @Column(name = "ACCESS_TOKEN")
    public String access_token;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "SERVICE_ID")
    @JsonIgnore
    public Service service;

    @Column(name = "EXPIRE_DATE")
    public Timestamp expireDate;
}
