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
import play.data.validation.Constraints;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
public class Minimalist {
    public static String TABLE = Minimalist.class.getSimpleName();

    @Id
    @Column(name = "minimalist_id")
    @XmlAttribute(name = "id")
    public Integer id;

    @Column(name = "service_id")
    @Id
    @JsonIgnore
    public Integer service_id;

    @JoinColumn(name = "service_id")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    public Service service;

    @Constraints.MaxLength(255)
    @Column(name = "NAME")
    @XmlAttribute(name = "name")
    public String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    @XmlAttribute(name = "type")
    public Enums.TrialName type;

    @Override
    public String toString() {
        return id+"";
    }

    @XmlRootElement(name = "minimalists")
    public static class MinimalistList
    {
        @XmlElement(name = "minimalist")
        public List<Minimalist> minimalists;
        public MinimalistList(List<Minimalist> minimalists)
        {
            this.minimalists=minimalists;
        }
    }

    @Embeddable
    public static class MinimalistPK
    {

    }
}

