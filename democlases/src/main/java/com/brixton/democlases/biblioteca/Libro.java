package com.brixton.democlases.biblioteca;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Libro {

    private String isbn;
    private String titulo;
    private String resumen;
    private String tags;
    private List<Autor> autores;
    private int cantidadPaginas;

}
