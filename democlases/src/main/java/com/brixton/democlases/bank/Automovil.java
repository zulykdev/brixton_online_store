package com.brixton.democlases.bank;

public class Automovil {
    //RELACION O MULTIPLICIDAD
    // [0 ... 1] [1 ... 1] [0 ... N] [1 a Muchos]
    //Atributo es motor
    Motor miMotor;
    //Atributo es Asiento
    List<Asiento> asientos;

    //Atributo Rueda
    List<Rueda> ruedas; // <- Es una coleccion de Rueda (Rueda1, Rueda2, Rueda3 .... RuedaN)

    TipoCambio tipoCambio;



}
