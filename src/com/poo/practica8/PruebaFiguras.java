package com.poo.practica8;

import com.poo.practica8.figuras.*;

public class PruebaFiguras {
    public static void main(String[] args) {

        System.out.println("Prueba de calculo de lados de un triangulo conociendo sus angulos y un lado");
        System.out.println("Se crea un triangulo cuyo lado a es igual a 15[cm] y los angulos A,B y C son 46,74 y 60 respectivamente");
        TrianguloEscaleno trianguloPrueba = new TrianguloEscaleno();

        /** Se inicializan los valores para la prueba **/
        trianguloPrueba.setLadoA(15);
        trianguloPrueba.setAlpha(46);
        trianguloPrueba.setBeta(74);
        trianguloPrueba.setGamma(60);

        System.out.println("Se utiliza la funcion leySeno para obtener el lado B");
        trianguloPrueba.setLadoB(trianguloPrueba.leySeno(trianguloPrueba.getLadoA(), trianguloPrueba.getAlpha(), trianguloPrueba.getBeta()));
        System.out.println("Se vuelve a usar la funcion para obtener el lado C");
        trianguloPrueba.setLadoC(trianguloPrueba.leySeno(trianguloPrueba.getLadoA(), trianguloPrueba.getAlpha(), trianguloPrueba.getGamma()));

        trianguloPrueba.ConvAngARad();
        System.out.println("Angulo Alpha: "+ trianguloPrueba.getAlpha() +"\tAngulo Alpha en Radianes: "+trianguloPrueba.getA());
        System.out.println("Angulo Beta: "+ trianguloPrueba.getBeta() +"\tAngulo Beta en Radianes: "+trianguloPrueba.getB());
        System.out.println("Angulo Gamma: "+ trianguloPrueba.getGamma() +"\tAngulo Gamma en Radianes: "+trianguloPrueba.getC());


        trianguloPrueba.imprimirDatos();

        trianguloPrueba.ConvRadAAng();

        trianguloPrueba.imprimirDatos();
    }
}