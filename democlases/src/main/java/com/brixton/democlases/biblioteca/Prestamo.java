package com.brixton.democlases.biblioteca;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class Prestamo {

    //LocalDate <- Fecha
    //LocalDateTime <- Fecha y hora
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Usuario usuarioOperacion;
    private Usuario bibliotecario;
    private String miSegundoCambio;

    private List<Libro> libros;

    public void agregarLibro(Libro libro) {
        //operaciones para agregar libro
    }

    public void retirarLibro(Libro libro) {
        //operaciones para quitar libro de lista de libros a prestar
    }

    public void devolverLibro(Libro libro) {

    }

    public void banearUsuario() {

    }
}
