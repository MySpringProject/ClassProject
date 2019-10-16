package com.hu.cs.project.project.Services;

import com.hu.cs.project.project.Model.Musics;
import org.springframework.stereotype.Service;

@Service
public interface MusicService {

    void saveMusics(Musics musics);

    Object findAll();

    Musics editMusicById(Long id);

    void deleteMusicById(Long id);
}
