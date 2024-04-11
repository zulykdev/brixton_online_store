package com.brixton.democlases.asociacion;

import java.util.ArrayList;
import java.util.List;

// Clase Pedido que representa un pedido realizado por un cliente
public class Pedido {
    private int numeroPedido;
    private Cliente cliente; // Relación de asociación con la clase Cliente
    private List<Producto> productos; // Relación de agregación con la clase Producto
    private Proveedor proveedor; // Relación de asociación dirigida con la clase Proveedor
    private EstadoPedido estado; // Relación de asociación ternaria con la clase EstadoPedido
    private String observaciones; // Asociación de atributo compartido

    public Pedido(int numeroPedido, Cliente cliente, Proveedor proveedor) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.proveedor = proveedor;
        this.productos = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    // Método para agregar un producto al pedido
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para obtener los productos del pedido
    public List<Producto> getProductos() {
        return productos;
    }

    // Método para establecer el estado del pedido
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    // Método para obtener el estado del pedido
    public EstadoPedido getEstado() {
        return estado;
    }

    // Método para establecer las observaciones del pedido
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // Método para obtener las observaciones del pedido
    public String getObservaciones() {
        return observaciones;
    }
}