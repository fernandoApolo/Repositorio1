package com.clases.java.programa2;

import java.util.Scanner;

public class ejercicioifelsec9 {
    public static void main(String[] args) {
        //13.Ingresar un número del 1 al 7 y mostrar el día de la semana que le corresponde. Asuma que el lunes es equivalente
        //al día 1 y el domingo al día 7.
        Scanner teclado=new Scanner(System.in);
    int n= teclado.nextInt();
    String dia = null;
    switch (n){
            case 1:
                dia="Lunes";
            break;
            case 2:
                dia="Martes";
            break;
            case 3:
                dia="Miercoles";
            break;
            case 4:
                dia="Jueves";
            break;
            case 5:
                dia="Viernes";
            break;
            case 6:
                dia="Sábado";
            break;
            case 7:
                dia="Domingo";
            break;
    }
        System.out.println(dia);
    }
}
