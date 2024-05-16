package com.clases.java.programa1;

import java.util.Scanner;

public class WhileSwitchCaseif {
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
            String mes = null;
            switch (nMes){
                case 0:
                    System.out.println("Has elegido la opción sin plomo 95, hasta luego!!");
                    ejecutar=false;
                    break;
                case 1:
                    mes="Enero";
                    break;
                case 2:
                    mes="Febrero";
                    break;
                case 3:
                    mes="Marzo";
                    break;
                case 4:
                    mes="Abril";
                    break;
                case 5:
                    mes="Mayo";
                    break;
                case 6:
                    mes="Junio";
                    break;
                case 7:
                    mes="Julio";
                    break;
                case 8:
                    mes="Agosto";
                    break;
                case 9:
                    mes="Septiembre";
                    break;
                case 10:
                    mes="Octubre";
                    break;
                case 11:
                    mes="Noviembre";
                    break;
                case 12:
                    mes="Diciembre";
                    break;
                default:
                    System.out.println("El número introducido no está dentro de los parámetros, por favor inténtelo de nuevo");
                    break;
            }
            if(nMes<13&&nMes>0){
                System.out.println("El número "+nMes+" corresponde al mes de "+mes);
            }
        }
    }
}
