package com.clases.java.programa2;

import java.util.Scanner;

public class ejercicioifelsec12 {
    public static void main(String[] args) {
        //6. Calcular y mostrar los números enteros cuadrados perfectos mayores que cero y menores a un número ingresado por
        //teclado. Utilice Mientras
        Scanner teclado= new Scanner(System.in);
        int tope=teclado.nextInt();
        int c=0;
        while (c<=tope){
            c++;
            if(c%Math.sqrt(c)==0){
                System.out.println("El número "+c+" es cuadrado perfecto de "+Math.sqrt(c));
            }
        }
    }
}
