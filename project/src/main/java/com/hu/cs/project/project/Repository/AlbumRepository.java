package com.hu.cs.project.project.Repository;

import com.hu.cs.project.project.Model.Albums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Albums, Long> {

}
