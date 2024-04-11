package com.brixton.democlases.asociacion;

// Clase Asociacion que representa la asociacion entre un Pedido y un Producto
public class Asociacion {
    private Pedido pedido;
    private Producto producto;

    public Asociacion(Pedido pedido, Producto producto) {
        this.pedido = pedido;
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Producto getProducto() {
        return producto;
    }
}
