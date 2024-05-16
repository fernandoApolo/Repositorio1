package com.clases.java.programa2;

import java.util.Scanner;

public class esPalindromo {
    static boolean esPalin(String cadena) {
        cadena = cadena.replace(" ", "").toLowerCase();
        StringBuilder cadenaInvertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {

            cadenaInvertida.append(cadena.charAt(i));
        }
        //System.out.println(cadenaInvertida.toString());
        return cadena.equals(cadenaInvertida.toString());
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra y te dire si es palíndromo o klk");
        String palabra=teclado.nextLine();
        if(esPalin(palabra)){
            System.out.println("La palabra "+palabra+" se lee igual pa la izquierda que pa la derecha");
        } else {
            System.out.println("La palabra "+palabra+" NO se lee igual de un lado que de otro");
        }
    }
}
