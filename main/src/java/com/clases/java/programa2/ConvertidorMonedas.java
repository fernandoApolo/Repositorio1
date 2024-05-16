package com.clases.java.programa2;

import java.util.Scanner;

public class ConvertidorMonedas {
    public static void convertir(double valorDolar, String pais){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de "+pais);
        double cantidadMonmeda = teclado.nextDouble();
        double dolares = cantidadMonmeda / valorDolar;
        dolares= (double)Math.round(dolares*100d)/100;
        System.out.println("Tienes en total "+dolares+" dolares");

    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean ejecutar = true;
        while (ejecutar){
            System.out.println("Conversor de monedas");
            System.out.println("1º Soles Peruanos a dolares");
            System.out.println("2º Pesos Mexicanos a dolares");
            System.out.println("3º Pesos Colombianos a dolares");
            System.out.println("4º Salir");
            System.out.println("Ingrese una opción: ");
            int opcion = teclado.nextInt();

        switch (opcion){
            case 1 :
                convertir(3.58, "soles peruanos");
                break;
            case 2 :
                convertir(22.15,"pesos mexicanos");
                break;
            case 3 :
                convertir(3851.9,"pesos colombianos");
                break;
            case 4 :
                System.out.println("Cerrando el programa, hasta luego compa");
                ejecutar=false;
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
        }
    }
}
