package com.clases.java.programa1;

public class IncrementatorandDecrementator {
    public static void main(String[] args) {
        int incrementador=0;
        //primera forma de incrementador +1
        incrementador=incrementador+1;
        System.out.println("El valor de la primera incrementación es "+incrementador);
        //Segunda forma de incrementador +1
        incrementador+=1;
        System.out.println("El valor de la segunda incrementación es "+incrementador);
        //Tercera forma de incrementador +1
        incrementador++;
        System.out.println("El valor de la tercera incrementación es "+incrementador);
        int decrementador=6;
        //primera forma de decrementador -1
        decrementador=decrementador-1;
        System.out.println("El valor de la primera decrementación es "+decrementador);
        //Segunda forma de decrementador -1
        decrementador-=1;
        System.out.println("El valor de la segunda decrementación es "+decrementador);
        //Tercera forma de decrementador -1
        decrementador--;
        System.out.println("El valor de la tercera decrementación es "+decrementador);

    }
}
