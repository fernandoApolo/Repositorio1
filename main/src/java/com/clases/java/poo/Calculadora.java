package com.clases.java.poo;

import java.util.Scanner;

public class Calculadora implements InterfazCalculadora{

    @Override
    public double suma(double n1, double n2) {
        return n1+n2;
    }

    @Override
    public double resta(double n1, double n2) {
        return n1-n2;
    }

    @Override
    public double multiplicación(double n1, double n2) {
        return n1*n2;
    }

    @Override
    public double division(double n1, double n2) throws Exception {
        double resultado=0;
        try {
            resultado=n1/n2;
        } catch (Exception e){
            throw new Exception("ERES UN HIJO DE PUTA!");
        }
        return resultado;
    }

    @Override
    public void pintarMenu() {
        System.out.println("1º Suma");
        System.out.println("2º Suma");
        System.out.println("3º Suma");
        System.out.println("4º Suma");
        System.out.println("Escoge una opción: ");
    }

    @Override
    public int recogerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    @Override
    public void ejecutar() {

    }
}
