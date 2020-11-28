package com.poo.practica8.figs_abstractas;

public abstract class Cuadrilatero extends Poligono {

    private double lado, base, altura;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

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



    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }

    public abstract void ConvAngARad();
    public abstract void ConvRadAAng();

    public String toString() {
        return "Cuadrilatero";
    }
}