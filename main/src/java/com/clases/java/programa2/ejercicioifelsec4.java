package com.clases.java.programa2;

public class ejercicioifelsec4 {
    public static void main(String[] args) {
        //4. Mostrar la suma de los números múltiplos de 5 menores a 50. Utilice Mientras.
        int c=0;
        int c1=0;
        while (c<50){
           if(c%5==0){
               c1=c1+c;
        }
           c++;
    }
        System.out.println("La suma de los multiplos es de "+c1);
}
}
