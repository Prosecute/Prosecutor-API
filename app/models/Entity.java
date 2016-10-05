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

public class Entity {

    @Id
    @Column(name = "entity_id")
    public Integer id;

    @Column(name = "service_id")
    @Id
    @JsonIgnore
    public Integer service_id;

    @JoinColumn(name = "service_id")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    public Service service;


}
