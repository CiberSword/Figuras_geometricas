package com.poo.practica8.figuras;

import java.lang.Math;

import com.poo.practica8.figs_abstractas.AngulosARadianes;
import com.poo.practica8.figs_abstractas.RadianesAAngulos;
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

    public void ConvAngARad(){
        setA((double) getAlpha()*(AngulosARadianes.Pi/180));
        setB((double) getBeta()*(AngulosARadianes.Pi/180));
        setC((double) getGamma()*(AngulosARadianes.Pi/180));
    }

    public void ConvRadAAng(){
        setAlpha((double) getA()*(180/ RadianesAAngulos.Pi));
        setBeta((double) getB()*(180/ RadianesAAngulos.Pi));
        setGamma((double) getC()*(180/ RadianesAAngulos.Pi));
    }

    public String toString(){
        return "Triangulo Escaleno";
    }

    public void imprimirDatos() {
        System.out.printf("Lados A, B y C: %.2f , %.2f y %.2f", getLadoA(), getLadoB(), getLadoC());
        System.out.println("\nArea: "+area()+"\nPerimetro: "+perimetro());
        System.out.println("\nAngulo Alpha: "+getAlpha()+"\nAngulo Beta: "+getBeta()+"\nAngulo Gamma: "+getGamma());
        System.out.println("Alpha en Radianes: "+getA()+"\nBeta en Radianes: "+getB()+"\nGamma en Radianes: "+getC());
    }

}
