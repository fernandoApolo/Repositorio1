package com.clases.java.programa2;

import java.util.Scanner;

public class ejercicioifelsec5 {
    public static void main(String[] args) {
        //5. Calcular y mostrar la cantidad de números pares comprendidos entre dos números ingresados por teclado utilizando
        //Mientras.
        System.out.println("Ingresa dos enteros  y te digo los pares que hay entre ellos");
        Scanner teclado=new Scanner(System.in);
        int n1= teclado.nextInt();
        int n2= teclado.nextInt();
        if(n2>=n1) {
            while (n2 >= n1) {
                if (n1 % 2 == 0) {
                    System.out.println("-" + n1);
                }
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

    }
}
