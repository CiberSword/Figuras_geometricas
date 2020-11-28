package com.poo.practica8.figuras;

import com.poo.practica8.figs_abstractas.Cuadrilatero;

public class Rombo extends Cuadrilatero {

    private double diagonalMenor, diagonalMayor;

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    @Override
    public double area() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public void imprimirDatos() {
        System.out.printf("Area: %.2f \n Perimetro: %.2f \n", area(), perimetro());
    }
}