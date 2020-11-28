package com.poo.practica8;

import com.poo.practica8.figs_abstractas.*;
import com.poo.practica8.figuras.*;

public class PruebaFigurasGeometricas {
    public static void main(String[] args){
        /**Creación de referencias de las subclases Cuadrado, Rombo y TrianguloEscaleno a partir de la clase
         * abstracta Poligono. Al trabajarlas de esta manera no es posible invocar alguno de los métodos que no
         * hayan sido declarados fuerda de la clase Poligono.
         */
        Poligono rombo = new Rombo();
        System.out.println("Soy un "+rombo.toString());

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

        //cuadrado2.getAngulos(); Método contenido en la clase Cuadrado, pero no en la clase Cuadrilatero.

        /**Creación de referencias a partir de los objetos Cuadrado, Rombo y Triangulo Escaleno. De esta manera, ya tenemos acceso a cada metodo
         * heredado y también definido dentro de cada clase.
         */
        System.out.println("\n\nSe crea un triangulo cuyo lado a sea igual a 15[cm] y los angulos A,B y C sean 46,74 y 60 grados respectivamente");
        TrianguloEscaleno triangulo = new TrianguloEscaleno();
        System.out.println("Soy un "+triangulo.toString());

        /**Inicialización de variables para la prueba*/
        triangulo.setLadoA(15);
        triangulo.setAlpha(46);
        triangulo.setBeta(74);
        triangulo.setGamma(60);

        System.out.println("Se utiliza la funcion leySeno para obtener el lado B");
        triangulo.setLadoB(triangulo.leySeno(triangulo.getLadoA(), triangulo.getAlpha(), triangulo.getBeta()));
        System.out.println("Se vuelve a usar la funcion para obtener el lado C");
        triangulo.setLadoC(triangulo.leySeno(triangulo.getLadoA(), triangulo.getAlpha(), triangulo.getGamma()));

        System.out.println("Obtenemos el valor de los angulos dados en grado, ahora en radianes.");
        triangulo.ConvAngARad();

        System.out.println("Imprimimos toda la información del Triangulo para verificar que se pueden manipular los valores de manera correcta.");
        triangulo.imprimirDatos();
    }
}
