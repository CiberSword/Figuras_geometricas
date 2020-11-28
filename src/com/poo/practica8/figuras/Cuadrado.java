package com.poo.practica8.figuras;

import com.poo.practica8.figs_abstractas.Cuadrilatero;

public class Cuadrado extends Cuadrilatero {

    public void imprimirDatos() {
        System.out.printf("Area: %.2f \n Perimetro: %.2f \n", area(), perimetro());
    }
}
