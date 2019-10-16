package com.hu.cs.project.project.Services;
import com.hu.cs.project.project.Model.Categories;
import org.springframework.stereotype.Service;

@Service
public interface CateguryService {

    void saveCategury(Categories categories);

    Object findAll();

    Categories findCateguryById(Long id);

    void deleteCateguryById(Long id);
}
