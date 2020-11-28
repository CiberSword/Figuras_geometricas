package com.poo.practica8.figs_abstractas;

public abstract class Triangulo extends Poligono {
    private double alpha, beta, gamma;    //Angulos en grados
    private double a, b, c;    // Angulos en radianes
    private double ladoA, ladoB, ladoC;

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

    public String toString() {
        return "Triangulo";
    }

    public double leySeno(double ladoA, double alpha, double beta) {
        return (Math.sin(beta) * ladoA) / Math.sin(alpha);
    }
}