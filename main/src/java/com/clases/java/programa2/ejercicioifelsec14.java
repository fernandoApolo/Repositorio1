package com.clases.java.programa2;

import java.util.Scanner;

public class ejercicioifelsec14 {
    public static void main(String[] args) {
        //11.Determinar y mostrar la suma de los términos de una progresión geométrica. Ingrese el valor del primer término, el valor de la
        //razón y el número de términos que tiene la progresión.
        Scanner teclado=new Scanner(System.in);
        int termino,razon,nveces,c=0;
        termino=teclado.nextInt();
        razon=teclado.nextInt();
        nveces=teclado.nextInt();
        while(c<nveces){
            c++;
            termino*=razon;
        }
        System.out.println("La suma de los términos es de "+termino);
    }
}
