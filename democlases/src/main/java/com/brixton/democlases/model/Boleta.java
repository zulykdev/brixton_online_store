package com.brixton.democlases.model;

import java.util.List;

public class Boleta {

    String rucEmisor;
    String nombreEmpresaEmisor;
    String nroSerie;
    String nroBoleta;

    Client cliente;

    List<LineaVenta> lineas;
    double montoTotal;


    void imprimir() {

    }

    void aplicarIGV() {

    }

    void calcularSubTotal() {

    }

    void addProduct(String producto, int cantidad, double precio) {

    }



}
