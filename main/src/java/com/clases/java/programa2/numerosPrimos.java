package com.clases.java.programa2;

import java.util.Scanner;

public class numerosPrimos {
    static boolean esPrimo(int numero){
        int contador = 0;
        int[] numeros= new int[numero];
        for (int i = 0; i < numeros.length ; i++) {
        numeros[i]=i+1;
        }
        for(int i:numeros){
            if(i==1||i==numero){
                continue;
            }
            if(numero%i==0){
                contador++;
            }
        }
    return contador==0; }
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce un número y te diré si es primo o no: ");
        int numero=teclado.nextInt();
        if(esPrimo(numero)){
            System.out.println("El número "+numero+" es primo");
        }else{
            System.out.println(" El número "+numero+" no es primo ");
        }
    }
}
