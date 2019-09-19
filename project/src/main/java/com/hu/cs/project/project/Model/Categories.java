package com.hu.cs.project.project.Model;

import javax.persistence.*;

@Entity
public class Categories {

    @Column(name = "category_id")
    private long ca_id;
    private String ca_collection;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getCa_id() {
        return ca_id;
    }

    public void setCa_id(long ca_id) {
        this.ca_id = ca_id;
    }

    public String getCa_collection() {
        return ca_collection;
    }

    public void setCa_collection(String ca_collection) {
        this.ca_collection = ca_collection;
    }
}
