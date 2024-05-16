package com.clases.java.programa2;

import java.util.Scanner;

public class ejercicioifelsec8 {
    public static void main(String[] args) {
        //12.Ingresar 20 números. Determinar y mostrar la cantidad de números pares, la cantidad de ceros y la cantidad de
        //números negativos ingresado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 20 numeros y le dire los pares, la cantidad de ceros y la cantidad de negativosb:");
        int[] numeroPedido;
        numeroPedido =new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingresa un número :");
            numeroPedido[i] = teclado.nextInt();
        }
            for (int dato : numeroPedido) {
                if (dato % 2 == 0) {
                    System.out.println("El número " + dato+ " es par");
                }
                if (dato == 0) {
                    System.out.println("El número " + dato+ "es 0");
                }
                if (dato < 0) {
                    System.out.println("El número " + dato+ "es negativo");
                }
            }
        }


            }