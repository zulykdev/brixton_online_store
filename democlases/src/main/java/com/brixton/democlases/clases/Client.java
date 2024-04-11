package com.brixton.democlases.clases;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {

    private String nombre;
    private String tipoIdentificacion;
    private String nroIdentificacion;
    private String categoria;
    private Integer edad;
    private Direccion direccion;


}
