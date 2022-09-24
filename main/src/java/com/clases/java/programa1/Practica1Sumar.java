package com.clases.java.programa1;

import java.util.Scanner;

public class Practica1Sumar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int n1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n2 = teclado.nextInt();
        int r = n1+n2;
        System.out.println("La suma de "+n1+" + "+n2+" = "+r);
    }
}
