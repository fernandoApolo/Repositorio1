package com.clases.java.programa1;

import java.util.Scanner;

public class Practica2PrecioVenta {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.print("Ingrese el valor de venta: ");
        double valor = teclado.nextDouble();
        double igv = valor * 0.18;
        double precioVenta = valor+igv;
        System.out.println("El valor de venta es : "+valor);
        System.out.println("El beneficio de la venta es : "+igv);
        System.out.println("El precio de venta es : "+precioVenta);
    }
}
