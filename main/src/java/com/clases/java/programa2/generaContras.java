package com.clases.java.programa2;

public class generaContras {
    static String generaContrasena(){
    char[] mayusculas= {'A','B','C','D','E','F'};
    char[] minusculas= {'a','b','c','d','e','f'};
    char[] numeros= {'1','2','3','4','5','6','7','8','9','0'};
    StringBuilder caracteres = new StringBuilder();
    caracteres.append(mayusculas);
    caracteres.append(minusculas);
    caracteres.append(numeros);

    StringBuilder contrasena = new StringBuilder();
        for (int i = 0; i <=15 ; i++) {
        int cantidadCaracteres= caracteres.length();
        int numeroRandom= (int) (Math.random()*cantidadCaracteres);
            contrasena.append(caracteres.charAt(numeroRandom));
        }
        return contrasena.toString();
    }
    public static void main(String[] args) {
        System.out.println(generaContrasena());
    }
}
