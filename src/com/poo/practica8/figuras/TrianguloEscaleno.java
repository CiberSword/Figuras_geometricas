package com.poo.practica8.figuras;

import java.lang.Math;

import com.poo.practica8.figs_abstractas.Triangulo;

public class TrianguloEscaleno extends Triangulo {

    private double base, altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    public double perimetro() {
        return getLadoA() + getLadoB() + getLadoC();
    }

    public void imprimirDatos() {
        System.out.printf("Lados A, B y C: %.2f , %.2f y %.2f", getLadoA(), getLadoB(), getLadoC());
    }
}
