package com.clases.java.programa1;

import java.util.Scanner;

public class EsMultiplo {
    public static void main(String[] args) {
        /*
        *
        * Programa el cual pedirá dos numeros enteros por teclado y dirá si el primero es múltiplo del segundo
         */
        //Paso 1 Definir teclado
        Scanner teclado = new Scanner(System.in);
        //Paso 2 definir dos variables de tipo entero
        int n1;
        int n2;
        //Paso 3 Pedir al usuario que introduzca los numeros entero
        System.out.println("Introduce el primer numero");
        //Paso 4 Guardar el primer entero por teclado
        n1= teclado.nextInt();
        //Paso 5 hacer lo mismo para el otro numero
        System.out.println("Introduce el segundo numero");
        n2= teclado.nextInt();
        //Paso 6 Crear if y pintar mensajes en funcion del resultado
        if (n1%n2==0){
            System.out.println("El número "+n1+" es múltiplo del número "+n2);
        }else{
            System.out.println("El número "+n1+" no es múltiplo del número "+n2);
        }
    }
}
