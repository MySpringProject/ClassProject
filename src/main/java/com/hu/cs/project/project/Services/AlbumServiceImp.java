package com.hu.cs.project.project.Services;

import com.hu.cs.project.project.Model.Albums;
import com.hu.cs.project.project.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImp implements AlbumServices {
    @Autowired
    AlbumRepository albumRepository;
    @Override
    public void saveAlbum(Albums album) {
        albumRepository.save(album);
    }

    @Override
    public Object findAll() {
        return albumRepository.findAll();
    }

    @Override
    public Albums findAlbumById(Long id) {
        return albumRepository.getOne(id);
    }

    @Override
    public void deleteAlbumById(Long id) {
        albumRepository.deleteById(id);
    }
}
