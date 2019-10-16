package com.hu.cs.project.project.Repository;

import com.hu.cs.project.project.Model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CateguryRepository extends JpaRepository<Categories , Long> {


}
