package com.hu.cs.project.project.Services;

import com.hu.cs.project.project.Model.Albums;

public interface AlbumServices {
    void saveAlbum(Albums album);

    Object findAll();

    Albums findAlbumById(Long id);

    void deleteAlbumById(Long id);
}
