package com.clases.java.programa1;

import java.util.Scanner;

public class WhileSwitchCase {
    public static void main(String[] args) {
        /*
        *Dado un numero entero introducido por teclado (entre 0 y 12)
        * decir que mes y ejecutar siempre que el numero entero no sea 0
         */
        Scanner teclado = new Scanner(System.in);
        int nMes;
        boolean ejecutar = true;
        while (ejecutar){
            System.out.println("Introduce un número del 1 al 12 y te diré que mes, y el 0 para salir");
            nMes= teclado.nextInt();
            switch (nMes){
                case 0:
                    System.out.println("Has elegido la opción sin plomo 95, hasta luego!!");
                    ejecutar=false;
                    break;
                case 1:
                    System.out.println("El número "+nMes+" corresponde al mes de Enero");
                    break;
                case 2:
                    System.out.println("El número "+nMes+" corresponde al mes de Febrero");
                    break;
                case 3:
                    System.out.println("El número "+nMes+" corresponde al mes de Marzo");
                    break;
                case 4:
                    System.out.println("El número "+nMes+" corresponde al mes de Abril");
                    break;
                case 5:
                    System.out.println("El número "+nMes+" corresponde al mes de Mayo");
                    break;
                case 6:
                    System.out.println("El número "+nMes+" corresponde al mes de Junio");
                    break;
                case 7:
                    System.out.println("El número "+nMes+" corresponde al mes de Julio");
                    break;
                case 8:
                    System.out.println("El número "+nMes+" corresponde al mes de Agosto");
                    break;
                case 9:
                    System.out.println("El número "+nMes+" corresponde al mes de Septiembre");
                    break;
                case 10:
                    System.out.println("El número "+nMes+" corresponde al mes de Octubre");
                    break;
                case 11:
                    System.out.println("El número "+nMes+" corresponde al mes de Noviembre");
                    break;
                case 12:
                    System.out.println("El número "+nMes+" corresponde al mes de Diciembre");
                    break;
                default:
                    System.out.println("El número introducido no está dentro de los parámetros, por favor inténtelo de nuevo");
                    break;
            }
        }
    }
}
