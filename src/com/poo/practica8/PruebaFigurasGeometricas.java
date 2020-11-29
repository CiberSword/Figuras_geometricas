package com.poo.practica8;

import com.poo.practica8.figs_abstractas.*;
import com.poo.practica8.figuras.*;

public class PruebaFigurasGeometricas {
    public static void main(String[] args){
        /**Creación de referencias de las subclases Cuadrado, Rombo y TrianguloEscaleno a partir de la clase
         * abstracta Poligono. Al trabajarlas de esta manera no es posible invocar alguno de los métodos que no
         * hayan sido declarados fuerda de la clase Poligono.
         */
        Poligono cuadrado = new Cuadrado();
        System.out.println("Soy un "+cuadrado.toString());

        Poligono rombo = new Rombo();
        System.out.println("Soy un "+rombo.toString());

        Poligono triangulo = new TrianguloEscaleno();
        System.out.println("Soy un "+triangulo.toString());

        //rombo.setDiagonalMayor(); Método no contenido en la clase Poligono. No puede ser invocado.

        /**Creación de referencias de las subclases Cuadrado, Rombo y TrianguloEscaleno a partir de las clases
         * abstractas Cuadrilatero y Triangulo. A partir de este momento, ya podemos comenzar a manipular un
         * poco los atributos de cada objeto que hayan heredado a partir de su clase padre Cuadrilatero o
         * Triangulo, sin embargo, los métodos propios de cada subclase quedan aún desconocidos.
         */
        Cuadrilatero cuadrado2 = new Cuadrado();
        System.out.println("\nSoy un "+cuadrado2.toString());

        cuadrado2.setLado(5);
        cuadrado2.setAltura(5);
        cuadrado2.setBase(5);

        System.out.println("Lado: "+cuadrado2.getLado());
        System.out.println("Altura: "+cuadrado2.getAltura());
        System.out.println("Base: "+cuadrado2.getBase());
        //System.out.println("Area: "+cuadrado2.area()+" [cm]^2"); Clase abstracta desarrollada dentro de cada clase para su uso individual.
        //System.out.println("Perimetro: "+cuadrado2.perimetro()+" [cm]");

        Cuadrilatero rombo2 = new Rombo();
        System.out.println("\nSoy un"+rombo2.toString());

        rombo2.setLado(6);
        cuadrado2.setAltura(2); //La altura en el rombo corresponde a la DiagonalMayor.
        cuadrado2.setBase(5); //La base en el rombo corresponde a la DIagonalMenor.

        System.out.println("Lado: "+rombo2.getLado());
        System.out.println("Altura: "+rombo2.getAltura());
        System.out.println("Base: "+rombo2.getBase());
        //System.out.println("Area: "+rombo2.area()+" [cm]^2");
        //System.out.println("Perimetro: "+rombo2.perimetro()+" [cm]");

        Triangulo triangulo2 = new TrianguloEscaleno();
        System.out.println("\nSoy un"+triangulo2.toString());

        triangulo2.setLadoA(10);
        triangulo2.setLadoB(15);
        triangulo2.setLadoC(20);

        System.out.println("Lado A: "+triangulo2.getLadoA());
        System.out.println("Lado B: "+triangulo2.getLadoB());
        System.out.println("Lado C: "+triangulo2.getLadoC());


        //cuadrado2.getAngulos(); Método contenido en la clase Cuadrado, pero no en la clase Cuadrilatero.

        /**Creación de referencias a partir de los objetos Cuadrado, Rombo y Triangulo Escaleno. De esta manera, ya tenemos acceso a cada metodo
         * heredado y también definido dentro de cada clase.
         */
        System.out.println("\n\nSe crea un triangulo cuyo lado a sea igual a 15[cm] y los angulos A,B y C sean 46,74 y 60 grados respectivamente");
        TrianguloEscaleno triangulo3 = new TrianguloEscaleno();
        System.out.println("Soy un "+triangulo.toString());

        /**Inicialización de variables para la prueba*/
        triangulo3.setLadoA(15);
        triangulo3.setAlpha(46);
        triangulo3.setBeta(74);
        triangulo3.setGamma(60);

        triangulo3.setBase(triangulo3.getLadoC());
        triangulo3.setAltura(9);

        System.out.println("Se utiliza la funcion leySeno para obtener el lado B");
        triangulo3.setLadoB(triangulo3.leySeno(triangulo3.getLadoA(), triangulo3.getAlpha(), triangulo3.getBeta()));
        System.out.println("Se vuelve a usar la funcion para obtener el lado C");
        triangulo3.setLadoC(triangulo3.leySeno(triangulo3.getLadoA(), triangulo3.getAlpha(), triangulo3.getGamma()));

        System.out.println("Obtenemos el valor de los angulos dados en grado, ahora en radianes.");
        triangulo3.ConvAngARad();

        System.out.println("Imprimimos toda la información del Triangulo para verificar que se pueden manipular los valores de manera correcta.");
        triangulo3.imprimirDatos();

        /**Copiamos la referencia del triangulo3 al 2. De esta manera, triangulo2 ya puede invocar métodos de la clase TrianguloEscaleno.*/
        triangulo2 = triangulo3;

        triangulo2.setGamma(29);

        System.out.println("Nuevo valor del angulo Gamma (De 60 a 29): "+triangulo2.getGamma());

        /**Para el cuadrado y el rombo, sería el mismo manejo de datos que como se realizó con el Triangulo.*/
    }
}
