package com.brixton.democlases.biblioteca;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Usuario {

    private String id;
    private String categoria;

    private boolean baneado;

    private String userId;
    private String password;

    private String estaActivo;

    private List<Libro> librosPrestados;

}
