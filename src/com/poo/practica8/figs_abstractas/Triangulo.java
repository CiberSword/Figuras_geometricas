package com.poo.practica8.figs_abstractas;

/**Herencia de Clases*/
public abstract class Triangulo extends Poligono {
    private double alpha, beta, gamma;    //Angulos en grados
    private double a, b, c;    // Angulos en radianes
    private double ladoA, ladoB, ladoC;

    /**Metodos getters y setters*/
    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getGamma() {
        return gamma;
    }

    public void setGamma(double gamma) {
        this.gamma = gamma;
    }

    public double getA(){ return a; }

    public void setA(double a){ this.a = a; }

    public double getB(){ return b; }

    public void setB(double b){ this.b = b; }

    public double getC(){ return c; }

    public void setC(double c){ this.c = c; }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    /**Sobreescritura del método toString de la clase Poligono*/
    public String toString() {
        return "Triangulo";
    }

    @Override
    public abstract double area();

    @Override
    public abstract double perimetro();

    public double leySeno(double ladoA, double a, double b) {
        return (Math.sin(b) * ladoA) / Math.sin(a);
    }

    /**Métodos heredados de las interfaces*/
    public abstract void ConvAngARad();
    public abstract void ConvRadAAng();
}