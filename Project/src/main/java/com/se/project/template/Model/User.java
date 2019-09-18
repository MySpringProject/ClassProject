package com.se.project.template.Model;

import javax.persistence.*;

@Entity
public class User {
    @Column(name = "user_id")
    private long u_id;
    private String u_firstname;
    private String u_lastname;
    private String u_name;
    private String u_password;
    private String u_created_at;
    private String u_updated_at;
    private String u_role;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getU_id() {
        return u_id;
    }

    public void setU_id(long u_id) {
        this.u_id = u_id;
    }

    public String getU_firstname() {
        return u_firstname;
    }

    public void setU_firstname(String u_firstname) {
        this.u_firstname = u_firstname;
    }

    public String getU_lastname() {
        return u_lastname;
    }

    public void setU_lastname(String u_lastname) {
        this.u_lastname = u_lastname;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_created_at() {
        return u_created_at;
    }

    public void setU_created_at(String u_created_at) {
        this.u_created_at = u_created_at;
    }

    public String getU_updated_at() {
        return u_updated_at;
    }

    public void setU_updated_at(String u_updated_at) {
        this.u_updated_at = u_updated_at;
    }

    public String getU_role() {
        return u_role;
    }

    public void setU_role(String u_role) {
        this.u_role = u_role;
    }
}
