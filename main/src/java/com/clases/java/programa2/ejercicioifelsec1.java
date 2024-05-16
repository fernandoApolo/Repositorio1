package com.clases.java.programa2;

public class ejercicioifelsec1 {
    public static void main(String[] args) {
        //1. Desarrollar una solución que permita mostrar los 10 primeros números naturales impares existentes. No deberá
        //ingresar datos.
        int i=0;
        int c=0;
        while (c<50){
            if(i%2!=0){
                System.out.println("Este es el número "+i);
                c++;
            }
            i++;
        }
    }
}
