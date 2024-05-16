package com.clases.java.programa2;

import java.util.Scanner;

public class calculadora1 {
    public static int pintarYrecoger(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Opción 1: Sumar");
        System.out.println("Opción 2: Restar");
        System.out.println("Opción 3: Multiplicar");
        System.out.println("Opción 4: Dividir");
        System.out.println("Opción 5: Salir");
        return teclado.nextInt();
    }
    /**
     *
     * @param n1 numero 1 a sumar
     * @param n2 numero 2 a sumar
     * @return suma entre el número 1 y 2
     */
    public static double sumar(double n1,double n2){
      return n1+n2;
    }
    public static double restar(double n1,double n2){
        return n1-n2;
    }
    public static double multiplicar(double n1,double n2){
        return n1*n2;
    }
    public static double dividir(double n1,double n2){
        if(n2!=0){
            System.out.println("No se puede dividir entre 0");
        return n1/n2;
    }else{return 0;}
    }
    public static double obtenerNumero(Scanner teclado, String primerOsegundo){
        teclado = new Scanner(System.in);
        System.out.println("Introduce el "+primerOsegundo+" número");
        return teclado.nextDouble();
    }
    public static int comprobaciónPintar(double resultado) {
        int contador=0;
        while (resultado % 7 == 0) {
            resultado /= 7;
            contador++;
            if (contador > 0) {
                System.out.println("El numero " + resultado + " es " + contador + " veces divisible entre 7");
            }

        }
        return contador;
    }
    public static double menu(double n1,double n2, int opcion){
        double resultado=0;
        switch (opcion){
            case 1: resultado=sumar(n1,n2);
                break;
            case 2: resultado=restar(n1,n2);
                break;
            case 3:resultado= multiplicar(n1,n2);
                break;
            case 4:resultado= dividir(n1,n2);
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion ;
        do  {
            opcion = pintarYrecoger();
        } while (opcion> 5 || opcion< 1 );
            if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                double n1 = obtenerNumero(teclado, "primer");
                double n2 = obtenerNumero(teclado, "segundo");
                double resultado = menu(n1, n2, opcion);
                System.out.println("El resultado es: " + resultado);
                comprobaciónPintar(resultado);
            } else if (opcion == 5) {
                System.out.println("Adiós");
            }
        }

    }

