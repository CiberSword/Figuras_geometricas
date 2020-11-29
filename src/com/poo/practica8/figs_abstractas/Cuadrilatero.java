package com.poo.practica8.figs_abstractas;

/**Herencia de Clases*/
public abstract class Cuadrilatero extends Poligono {

    private double lado, base, altura;

    /**Métodos getters y setters*/
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
    public abstract double area();

    @Override
    public abstract double perimetro();

    /**Métodos heredados de las interfaces*/
    public abstract void ConvAngARad();
    public abstract void ConvRadAAng();

    /**Sobreescritura del método toString de la clase Poligono*/
    public String toString() {
        return "Cuadrilatero";
    }
}