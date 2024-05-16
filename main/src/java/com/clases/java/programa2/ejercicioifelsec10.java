package com.clases.java.programa2;

import java.util.Scanner;

public class ejercicioifelsec10 {
    //14.Leer la categoría y sueldo de un trabajador y calcular el aumento correspondiente de acuerdo a la tabla adjunta.
    //Mostrar el sueldo incrementado del trabajador.
    //Categoría Aumento
    //A 18%
    //B 12%
    //C 9%
    //D 6%
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce primero categoría y luego sueldo y te diré el sueldo incrementado: ");
        String categoria=teclado.next().toUpperCase();
        double sueldo = teclado.nextDouble();
        switch (categoria){
            case "A":
                sueldo*=1.18;
                break;
            case "B":
                sueldo*=1.12;
                break;
            case "C":
                sueldo*=1.09;
                break;
            case "D":
                sueldo*=1.06;
                break;
        }
        System.out.println("El sueldo con aumento será de "+sueldo);
    }
}
