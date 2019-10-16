package com.hu.cs.project.project.Repository;

import com.hu.cs.project.project.Model.Musics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MusicRepository extends JpaRepository<Musics , Long> {

}
