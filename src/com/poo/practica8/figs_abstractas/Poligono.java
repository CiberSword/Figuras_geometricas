package com.poo.practica8.figs_abstractas;

/**Multiherencia de las interfaces para la conversion de los angulos*/
public abstract class Poligono implements AngulosARadianes,RadianesAAngulos{

    /**Declaración de todos los métodos que contendrá la clase Poligono y por ende todas sus subclases.*/
    public abstract double area();

    public abstract double perimetro();

    public abstract void ConvAngARad();

    public abstract void ConvRadAAng();

    /**Sobreescritua del método toString.*/
    public String toString() {
        return "Poligono";
    }
}