package com.crud.crud_books.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_LIVRO")
public class livroModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String owner;

    public livroModels(){

    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
