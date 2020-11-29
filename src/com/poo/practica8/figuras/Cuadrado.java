package com.poo.practica8.figuras;

import com.poo.practica8.figs_abstractas.AngulosARadianes;
import com.poo.practica8.figs_abstractas.Cuadrilatero;
import com.poo.practica8.figs_abstractas.RadianesAAngulos;

/**Herencia de Clases*/
public class Cuadrado extends Cuadrilatero {
    private double a;
    private static final double angulos=90;

    /**Métodos getters y setters*/
    public double getAngulos(){ return angulos; }

    public void setA(double a){ this.a = a; }

    public double getA(){ return a;}

    /**Implementación de los métodos contenidos en la interfaces*/
    public void ConvAngARad(){
        setA((double) getAngulos()*(AngulosARadianes.Pi/180));
    }

    public void ConvRadAAng(){
        System.out.println("Angulos en Radianes a Angulos en grados: " + getA()*(180/RadianesAAngulos.Pi));
    }

    /**Sobreescritura del método abstracto area de la clase Poligono*/
    public double area() {
        return getLado() * getLado();
    }

    /**Sobreescritura del método abstracto perimetro de la clase Poligono*/
    public double perimetro(){ return getLado() * 4; }


    /**Sobreescritura del método toString de la clase Poligono*/
    public String toString(){
        return "Cuadrado";
    }
    
    /**Impresión de todos los datos*/
    public void imprimirDatos() {
        System.out.println("Lados: "+getLado());
        System.out.printf("Area: %.2f \n Perimetro: %.2f \n", area(), perimetro());
        System.out.println("Angulos: "+getAngulos());
        ConvAngARad();
        System.out.println("Angulos en radianes: "+getA());
    }
}
