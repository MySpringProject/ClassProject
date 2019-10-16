package com.hu.cs.project.project.Model;

import javax.persistence.*;

@Entity
public class Users {
    @Column(name = "user_id")
    private long user_id;
    private String user_firstname;
    private String user_lastname;
    private String user_name;
    private String user_password;
    private String user_created_at;
    private String user_updated_at;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_firstname() {
        return user_firstname;
    }

    public void setUser_firstname(String user_firstname) {
        this.user_firstname = user_firstname;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public void setUser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_created_at() {
        return user_created_at;
    }

    public void setUser_created_at(String user_created_at) {
        this.user_created_at = user_created_at;
    }

    public String getUser_updated_at() {
        return user_updated_at;
    }

    public void setUser_updated_at(String user_updated_at) {
        this.user_updated_at = user_updated_at;
    }
}
