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
        System.out.println("\n\nSoy un "+cuadrado2.toString());

        cuadrado2.setLado(5);
        cuadrado2.setAltura(5);
        cuadrado2.setBase(5);

        System.out.println("Lado: "+cuadrado2.getLado());
        System.out.println("Altura: "+cuadrado2.getAltura());
        System.out.println("Base: "+cuadrado2.getBase());

        //cuadrado2.getAngulos(); Método contenido en la clase Cuadrado, pero no en la clase Cuadrilatero.


    }
}
