package com.hu.cs.project.project.Services;

import com.hu.cs.project.project.Model.Musics;
import com.hu.cs.project.project.Repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicRepository musicRepository;

    @Override
    public void saveMusics(Musics musics) {
        musicRepository.save(musics);
    }

    @Override
    public Object findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Musics editMusicById(Long id) {
        return musicRepository.getOne(id);
    }

    @Override
    public void deleteMusicById(Long id) {
        musicRepository.deleteById(id);
    }


}
