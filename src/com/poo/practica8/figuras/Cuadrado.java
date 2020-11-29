package com.poo.practica8.figuras;

import com.poo.practica8.figs_abstractas.AngulosARadianes;
import com.poo.practica8.figs_abstractas.Cuadrilatero;
import com.poo.practica8.figs_abstractas.RadianesAAngulos;

public class Cuadrado extends Cuadrilatero {
    private double a;
    private static final double angulos=90;

    public double getAngulos(){ return angulos; }

    public void setA(double a){ this.a = a; }

    public double getA(){ return a;}

    public void ConvAngARad(){
        setA((double) getAngulos()*(AngulosARadianes.Pi/180));
    }

    public void ConvRadAAng(){
        System.out.println("Angulos en Radianes a Angulos en grados: " + getA()*(180/RadianesAAngulos.Pi));
    }

    public double area() {
        return getLado() * getLado();
    }

    public double perimetro(){ return getLado() * 4; }
    
    public String toString(){
        return "Cuadrado";
    }
    
    public void imprimirDatos() {
        System.out.printf("Area: %.2f \n Perimetro: %.2f \n", area(), perimetro());
    }
}
