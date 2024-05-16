package com.clases.java.programa2;

import java.util.Scanner;

public class ejercicioifelsec13 {
    public static void main(String[] args) {
        //10.Determinar y mostrar los términos de una progresión aritmética. Ingrese el valor del primer término, el valor de la
        //razón y el número de términos que tiene la progresión.
        Scanner teclado=new Scanner(System.in);
        int termino,razon,nveces,c=0;
        termino=teclado.nextInt();
        razon=teclado.nextInt();
        nveces=teclado.nextInt();
        while(c<nveces){
            c++;
            System.out.println(termino+=razon);
        }
    }
}
