package com.hu.cs.project.project.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Albums {
    @Column(name = "album_id")
    private long album_id;
    private String album_name;
    private String album_create;
    private Set<Categories> categories;
    private Set<Musics> musics;



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(long album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getAlbum_create() {
        return album_create;
    }

    public void setAlbum_create(String album_create) {
        this.album_create = album_create;
    }

    @JoinColumn(name = "album")
    @OneToMany
    public Set<Categories> getCategories() {
        return categories;
    }

    public void setCategories(Set<Categories> categories) {
        this.categories = categories;
    }

    @ManyToMany
    public Set<Musics> getMusics() {
        return musics;
    }

    public void setMusics(Set<Musics> musics) {
        this.musics = musics;
    }



}
