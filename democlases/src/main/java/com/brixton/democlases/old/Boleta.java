package com.brixton.democlases.old;

import com.brixton.democlases.clases.Client;
import com.brixton.democlases.clases.LineaVenta;

import java.util.List;

public class Boleta {

    //ACCESO | TIPO DE DATO | NOMBRE VARIABLE
    /** Aplican a Atributos y Metodos.
     * public - cualquiera puede utilizar esos metodos.
     * private - solo puede ser utilizado por la clase.
     * protected - solo puede ser utilizado por la clase o superclase
     * package (no se especifica) - solo puede ser utilizado por el paquete (es por defecto)
     */
    private String rucEmisor; //Acceso package
    private String nombreEmpresaEmisor;
    private String nroSerie;
    private String nroBoleta;
    private Client clientito;
    private List<LineaVenta> lineas;
    private double montoTotal;



    //SET <- Asignacion, siempre son de tipo "void"
    //[Acceso] [Tipo de dato de retorno] [Nombre Metodo] [parametros]
    //void [Nombre Metodo] ([parametros])
    public void setRucEmisor(String aRucRemisor) {
        rucEmisor = aRucRemisor;
    }

    //GET <- obtención
    //[Acceso] [Tipo de dato de retorno] [Nombre Metodo] [parametros]
    public String getRucEmisor() {
        return rucEmisor;
    }

    public String getNombreEmpresaEmisor() {
        return nombreEmpresaEmisor;
    }

    public void setNombreEmpresaEmisor(String nombreEmpresaEmisor) {
        this.nombreEmpresaEmisor = nombreEmpresaEmisor;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public String getNroBoleta() {
        return nroBoleta;
    }

    public void setNroBoleta(String nroBoleta) {
        this.nroBoleta = nroBoleta;
    }

    public List<LineaVenta> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaVenta> lineas) {
        this.lineas = lineas;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Client getClientito() {
        return clientito;
    }

    public void setClientito(Client clientito) {
        this.clientito = clientito;
    }
}
