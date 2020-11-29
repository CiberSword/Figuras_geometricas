package com.poo.practica8.figuras;

import com.poo.practica8.figs_abstractas.AngulosARadianes;
import com.poo.practica8.figs_abstractas.Cuadrilatero;
import com.poo.practica8.figs_abstractas.RadianesAAngulos;

/**Herencia de Clases*/
public class Rombo extends Cuadrilatero {

    private double Alpha,Beta;

    private double a,b;

    /**Métodos getters y setters*/
    public double getAlpha(){return Alpha;}

    public void setAlpha(double Alpha){ this.Alpha = Alpha; }

    public double getBeta(){ return Beta; }

    public void setBeta(double Beta){ this.Beta = Beta; }

    public double getA(){ return a; }

    public void setA(double a){ this.a = a; }

    public double getB(){ return b; }

    public void setB(double b){ this.b = b; }

    /**Sobreescritura del método abstracto area de la clase Poligono*/
    public double area() {
        return (getBase() * getAltura()) / 2;
    }

    /**Sobreescritura del método abstracto perimetro de la clase Poligono*/
    public double perimetro(){ return getLado()*4; }

    /**Implementación de los métodos contenidos en la interfaces*/
    public void ConvAngARad(){
        setA((double) getAlpha()*(AngulosARadianes.Pi/180));
        setB((double) getBeta()*(AngulosARadianes.Pi/180));
    }

    public void ConvRadAAng(){
        setAlpha((double) getA()*(180/RadianesAAngulos.Pi));
        setBeta((double) getB()*(180/RadianesAAngulos.Pi));
    }

    /**Sobreescritura del método toString de la clase Poligono*/
    public String toString(){
        return "Rombo";
    }

    public void imprimirDatos() {
        System.out.println("DiagonalMayor: "+getAltura());
        System.out.println("DiagonalMenor: "+getBase());
        System.out.printf("Area: %.2f \n Perimetro: %.2f \n", area(), perimetro());
        ConvAngARad();
        System.out.println("Angulo Alpha en Radianes "+getAlpha());
        System.out.println("Angulo Beta en Radianes: "+getBeta());
    }
}