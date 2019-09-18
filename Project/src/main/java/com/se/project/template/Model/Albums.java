package com.se.project.template.Model;

import javax.persistence.*;

@Entity
public class Albums {
    @Column(name = "column_id")
    private String al_name;
    private String al_create;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getAl_name() {
        return al_name;
    }

    public void setAl_name(String al_name) {
        this.al_name = al_name;
    }

    public String getAl_create() {
        return al_create;
    }

    public void setAl_create(String al_create) {
        this.al_create = al_create;
    }
}
