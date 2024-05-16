package com.clases.java.programa1;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        * Dado un entero por teclado entre 1 y 7, dirá a que diá de la semana pertenece
        * En caso de que el entero no esté entre el 1 y 7 indique un error
         */
        Scanner teclado = new Scanner(System.in);
        int numerodelasemana;
        System.out.println("Introduce un número correspondiente al " +
                "día de la semana y te diré el día al que te refieres :");
        numerodelasemana= teclado.nextInt();
        switch (numerodelasemana){
                case 1 :
                System.out.println("El día de la semana es Lunes");
                break;
                case 2 :
                System.out.println("El día de la semana es Martes");
                break;
                case 3 :
                System.out.println("El día de la semana es Miércoles");
                break;
                case 4 :
                System.out.println("El día de la semana es Jueves");
                break;
                case 5 :
                System.out.println("El día de la semana es Viernes");
                break;case 6 :
                System.out.println("El día de la semana es Sábado");
                break;
                case 7 :
                System.out.println("El día de la semana es Domingo");
                break;
            default:
                System.out.println("El número introducido no es correcto");


        }
    }
}
