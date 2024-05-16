package com.clases.java.programa2;

import java.util.Scanner;

public class calculadora1punto1 {

    public static int pintarYrecoger(){
    Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }


    public static double[] recogerNumeros(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el primer número");
        double n1= teclado.nextDouble();
        System.out.println("Introduce el segundo número");
        double n2= teclado.nextDouble();
        double[] devuelta = {n1,n2};
        return devuelta;
    }
    public static int divisible7(double resultado){
        int contador=0;
        for (int i = 1; i<resultado ; i++) {
            if(i%7==0){
                contador++;
            }
        }
        return contador;
    }
}
