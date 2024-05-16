package com.clases.java.programa2;

public class ejercicioifelsec6 {
    public static void main(String[] args) {
        //8. Calcular y mostrar los 10 primeros números positivos múltiplos de 7.
    int nVueltas=0,contadorMultiplos=0;
    while(contadorMultiplos<10){
        nVueltas++;
        if (nVueltas%7==0){
            System.out.println("-"+nVueltas);
            contadorMultiplos++;
        }
    }
    }
}
