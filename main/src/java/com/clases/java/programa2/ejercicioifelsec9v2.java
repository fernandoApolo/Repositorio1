package com.clases.java.programa2;

import java.util.Scanner;

public class ejercicioifelsec9v2 {
    public static void main(String[] args) {
        //13.Ingresar un número del 1 al 7 y mostrar el día de la semana que le corresponde. Asuma que el lunes es equivalente
        //al día 1 y el domingo al día 7.
        Scanner teclado=new Scanner(System.in);
    int n= teclado.nextInt();
    String[] dia ={"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        System.out.println(dia[n-1]);
    }
}
