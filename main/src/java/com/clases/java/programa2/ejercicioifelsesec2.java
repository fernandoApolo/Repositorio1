package com.clases.java.programa2;

public class ejercicioifelsesec2 {
    public static void main(String[] args) {
        //2. Desarrollar una solución que permita mostrar los números múltiplos de tres, y la cantidad, comprendidos entre los
        //números 1 000 y 1 500. No deberá ingresar datos.
        int c=1000;
        int c1=0;
        while (c<=1500){
            if(c%3==0){
                System.out.println(+c);
                c1++;
            }
            c++;
        }
        System.out.println("En total hay "+c1+" multiplos entre el 1000 y 1500");
    }

}
