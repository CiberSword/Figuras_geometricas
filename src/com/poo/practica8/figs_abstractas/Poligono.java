package com.poo.practica8.figs_abstractas;

public abstract class Poligono implements AngulosARadianes,RadianesAAngulos{

    public abstract double area();

    public abstract double perimetro();

    public abstract void ConvAngARad();

    public abstract void ConvRadAAng();

    public String toString() {
        return "Poligono";
    }
}