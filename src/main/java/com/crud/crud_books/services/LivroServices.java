package com.crud.crud_books.services;

import com.crud.crud_books.models.livroModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.crud_books.repository.LivroRepository;

import java.util.List;

@Service
public class LivroServices {

    @Autowired
    private LivroRepository livroRepository;

    public List<livroModels> findAll(){
        return livroRepository.findAll();
    }
}
