package com.se.project.template.Model;

import javax.persistence.*;

@Entity
public class Musics {
    @Column(name = "music_id")
    private long mu_id;
    private String mu_fun;
    private String mu_singer;
    private String mu_composer;
    private String mu_listen;
    private int mu_is_fav;

    public long getMu_id() {
        return mu_id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public void setMu_id(long mu_id) {
        this.mu_id = mu_id;
    }

    public String getMu_fun() {
        return mu_fun;
    }

    public void setMu_fun(String mu_fun) {
        this.mu_fun = mu_fun;
    }

    public String getMu_singer() {
        return mu_singer;
    }

    public void setMu_singer(String mu_singer) {
        this.mu_singer = mu_singer;
    }

    public String getMu_composer() {
        return mu_composer;
    }

    public void setMu_composer(String mu_composer) {
        this.mu_composer = mu_composer;
    }

    public String getMu_listen() {
        return mu_listen;
    }

    public void setMu_listen(String mu_listen) {
        this.mu_listen = mu_listen;
    }

    public int getMu_is_fav() {
        return mu_is_fav;
    }

    public void setMu_is_fav(int mu_is_fav) {
        this.mu_is_fav = mu_is_fav;
    }
}
