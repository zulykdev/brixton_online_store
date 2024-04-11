package com.brixton.democlases.asociacion;

import java.util.ArrayList;
import java.util.List;

// Clase Cliente que representa a un cliente de la tienda
public class Cliente {
    private String nombre;
    private List<Pedido> pedidosRealizados; // Relación de asociación con la clase Pedido

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidosRealizados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // Método para realizar un nuevo pedido
    public void realizarPedido(Pedido pedido) {
        pedidosRealizados.add(pedido);
    }

    // Método para obtener los pedidos realizados por el cliente
    public List<Pedido> getPedidosRealizados() {
        return pedidosRealizados;
    }
}