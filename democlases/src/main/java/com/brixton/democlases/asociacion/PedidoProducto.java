package com.brixton.democlases.asociacion;

// Clase PedidoProducto que representa una asociacion compuesta entre Pedido y Producto
public class PedidoProducto {
    private Pedido pedido;
    private Producto producto;

    public PedidoProducto(Pedido pedido, Producto producto) {
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