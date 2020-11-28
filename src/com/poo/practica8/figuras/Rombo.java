package com.poo.practica8.figuras;

import com.poo.practica8.figs_abstractas.AngulosARadianes;
import com.poo.practica8.figs_abstractas.Cuadrilatero;
import com.poo.practica8.figs_abstractas.RadianesAAngulos;

public class Rombo extends Cuadrilatero {

    private double Alpha,Beta;

    private double a,b;

    private double diagonalMenor, diagonalMayor;

    public double getAlpha(){return Alpha;}

    public void setAlpha(double Alpha){ this.Alpha = Alpha; }

    public double getBeta(){ return Beta; }

    public void setBeta(double Beta){ this.Beta = Beta; }

    public double getA(){ return a; }

    public void setA(double a){ this.a = a; }

    public double getB(){ return b; }

    public void setB(double b){ this.b = b; }

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

    public void ConvAngARad(){
        setA((double) getAlpha()*(AngulosARadianes.Pi/180));
        setB((double) getBeta()*(AngulosARadianes.Pi/180));
    }

    public void ConvRadAAng(){
        setAlpha((double) getA()*(180/RadianesAAngulos.Pi));
        setBeta((double) getB()*(180/RadianesAAngulos.Pi));
    }

    public String toString(){
        return "Rombo";
    }

    public void imprimirDatos() {
        System.out.printf("Area: %.2f \n Perimetro: %.2f \n", area(), perimetro());
    }
}