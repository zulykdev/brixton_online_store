package com.brixton.democlases.asociacion;

// Clase ClienteAutor que representa una asociacion reflexiva entre Cliente y Cliente
public class ClienteAutor {
    private Cliente cliente1;
    private Cliente cliente2;

    public ClienteAutor(Cliente cliente1, Cliente cliente2) {
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    public Cliente getCliente2() {
        return cliente2;
    }
}