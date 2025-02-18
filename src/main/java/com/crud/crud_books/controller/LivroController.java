package com.crud.crud_books.controller;

import com.crud.crud_books.models.livroModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.crud_books.services.LivroServices;

import java.util.List;

@RestController
@RequestMapping(path = "/alunos")
public class LivroController {

    @Autowired
    private LivroServices livroServices;

    @GetMapping
    public List<livroModels> findAll(){
        return livroServices.findAll();
    }

}
