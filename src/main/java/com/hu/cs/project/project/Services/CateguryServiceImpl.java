package com.hu.cs.project.project.Services;

import com.hu.cs.project.project.Model.Albums;
import com.hu.cs.project.project.Model.Categories;
import com.hu.cs.project.project.Repository.CateguryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CateguryServiceImpl implements CateguryService {

    @Autowired
    private CateguryRepository categuryrepository;
    @Override
    public void saveCategury(Categories categories) {
        categuryrepository.save(categories);
    }

    @Override
    public Object findAll() {
        return categuryrepository.findAll();
    }

    @Override
    public Categories findCateguryById(Long id) {
        return categuryrepository.getOne(id);
    }

    @Override
    public void deleteCateguryById(Long id) {
        categuryrepository.deleteById(id);
    }
}
