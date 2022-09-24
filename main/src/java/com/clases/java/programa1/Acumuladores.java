package com.clases.java.programa1;

public class Acumuladores {
    public static void main(String[] args) {
        double acumulador;
        //iniciamos el acumulador
        acumulador=10;
        //acumulador suma el resultado el 16
        acumulador+=6;
        System.out.println("El resultado de acumulador suma es: "+acumulador);
        //acumulador resta el resultado es 13
        acumulador-=3;
        System.out.println("El resultado del acumulador resta es: "+acumulador);
        //acumulador multiplicación el resultado es 26
        acumulador*=2;
        System.out.println("El resultado del acumulador multiplicación es: "+acumulador);
        //acumulador divisor
        acumulador/=0.5;
        System.out.println("El resultado del acumulador división es :"+acumulador);
        //acumulador resto o modulo
        acumulador%=3;
        System.out.println("El resultado del acumulador resto(modulo) es :"+acumulador);

    }
}
