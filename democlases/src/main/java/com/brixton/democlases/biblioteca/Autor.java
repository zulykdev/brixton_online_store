package com.brixton.democlases.biblioteca;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Autor {

    private String id;
    private String nombres;
    private String apellidos;
    private List<Libro> relatedBooks;

}
