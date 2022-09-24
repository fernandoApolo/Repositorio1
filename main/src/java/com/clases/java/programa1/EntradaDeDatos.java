package com.clases.java.programa1;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
      // System.out.println("Introduce un número entero : ");
      // int entradaEntero= teclado.nextInt();
       // System.out.println("El número introducido es : "+entradaEntero);
        System.out.println("Introduce un string bien largo compai :");
        String entradaString=teclado.nextLine();
        System.out.println("El String introducido es : "+entradaString);

    }
}
