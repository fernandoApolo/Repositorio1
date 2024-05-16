package com.clases.java.programa2;

import java.util.Scanner;

public class ejercicioifelsec {
    public static void main(String[] args) {
        //9. Calcular y mostrar la cantidad de números pares y la suma de los números múltiplos de 3 comprendidos entre dos
        //números ingresados por teclado.
        Scanner teclado=new Scanner(System.in);
        int n1,n2,suma3 = 0,sumam2 = 0;
        System.out.println("Ingrese dos números y le dire la cantidad de pares y la suma de los múltiplos de tres");
        n1=teclado.nextInt();
        n2=teclado.nextInt();
        if(n2>=n1) {
            while (n2 >= n1) {
                if (n1 % 2 == 0) {
                    sumam2++;
                } else if (n1%3==0){suma3+=n1;}
                n1++;
            }
        } else {
            while (n2 <= n1) {
                if (n2 % 2 == 0) {
                    System.out.println("-" + n2);
                }
                n2++;
            }
    }
        System.out.println("La suma de numeros múltiplos de 2 es "+sumam2);
        System.out.println("La suma de los múltiplos de 3 es de "+suma3);
}}
