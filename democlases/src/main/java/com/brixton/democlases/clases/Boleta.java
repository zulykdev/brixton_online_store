package com.brixton.democlases.clases;

import com.brixton.democlases.model.Client;
import com.brixton.democlases.model.LineaVenta;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Boleta {

    private String rucEmisor;
    private String nombreEmpresaEmisor;
    private String nroSerie;
    private String nroBoleta;
    private Client cliente;
    private List<LineaVenta> lineas;
    private double montoTotal;

    public void imprimir() {
        //operacion para imprimir el comprobante.
    }

    public void aplicarIGV() {
        //operaciones para asignar aplicar IGV
    }

    public void calcularSubTotal() {
        //operaciones para calcular el subTotal
    }

    public Double getSubTotal() {
        return null;
    }

    public void addProduct(String producto, int cantidad, double precio) {
        //operaciones para agregar un producto.
    }


}
