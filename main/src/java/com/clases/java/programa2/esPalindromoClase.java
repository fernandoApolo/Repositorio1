package com.clases.java.programa2;

import java.util.Scanner;

public class esPalindromoClase {
    public static boolean esPalindromo(String palabra){
        palabra=palabra.replace(" ","").toLowerCase();
        char[] cadena = palabra.toCharArray();
        boolean salida=true;
        for (int i = 0; i < cadena.length/2 ; i++) {
            if (cadena[i]==cadena[cadena.length-1-i]){
                System.out.println("Voy bien");
            } else {
                salida=false;
            }
        }
        return salida;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra=teclado.nextLine();
        boolean palindromo= esPalindromo(palabra);
        if (palindromo){
            System.out.println("SI SOY UN PALINDROMO");
        } else {
            System.out.println("NO SOY PALINDROMO");
        }
    }
}
