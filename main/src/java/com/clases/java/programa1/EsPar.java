package com.clases.java.programa1;

import java.util.Scanner;

public class EsPar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entradaEntero;
        System.out.println("Introduce un numero entero por teclado y te dire si es par o no");
        entradaEntero=teclado.nextInt();
        if(entradaEntero%2==0){
            System.out.println("El numero "+entradaEntero+" introducido por teclado es par");
        } else {
            System.out.println("El numero "+entradaEntero+" por teclado es impar");
        }
    }
}
