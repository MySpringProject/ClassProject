package com.hu.cs.project.project.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Categories {

    //@Column(name = "category_id")
    private long id;
    private String ca_collection;
    private Albums albums;
    private Set<Musics> musicsSet;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCa_collection() {
        return ca_collection;
    }

    public void setCa_collection(String ca_collection) {
        this.ca_collection = ca_collection;
    }

    @ManyToOne
    public Albums getAlbums() {
        return albums;
    }

    public void setAlbums(Albums albums) {
        this.albums = albums;
    }

    @ManyToMany
    public Set<Musics> getMusicsSet() {
        return musicsSet;
    }

    public void setMusicsSet(Set<Musics> musicsSet) {
        this.musicsSet = musicsSet;
    }



}
