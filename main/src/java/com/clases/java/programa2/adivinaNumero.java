package com.clases.java.programa2;

import java.util.Scanner;

public class adivinaNumero {
    public static void jugar(int vidas){
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random()*101);
        int numeroElegido = -1;

        while (numeroElegido!= numeroAleatorio){
            System.out.println("Ingrese un número entre 1 y 100: ");
            numeroElegido= teclado.nextInt();

            if(numeroAleatorio<numeroElegido){
                System.out.println("El número es mas pequeño ");
                vidas--;
            } else if (numeroAleatorio>numeroElegido) {
                System.out.println("El nímero es más grande ");
                vidas--;
            }
            if(vidas==0){
                System.out.println("GAME OVER");
                break;
            }
            System.out.println("Te quedan "+vidas+" vidas");
        }
        if(numeroAleatorio==numeroElegido){
            System.out.println("Ganaste champion");
        }
    }
    public static void main(String[] args) {
        OUTER:
        while (true){
            System.out.println("Juego adivina el número");
            System.out.println("1. Nivel Fácil");
            System.out.println("2. Nivel Intermedio");
            System.out.println("3. Nivel Dificil");
            System.out.println("4. Salir");
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese una opción");
            int opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    jugar(10);
                    break;
                case 2:
                    jugar(7);
                    break;
                case 3:
                    jugar(4);
                    break;
                case 4:
                    System.out.println("Estas cerrando el programa");
                    break OUTER;
                default:
                    System.out.println("Opción incorrecta");
            }
        }

    }
}
