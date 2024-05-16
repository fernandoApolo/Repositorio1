package com.clases.java.programa2;

import java.util.Scanner;

public class ejercicioifelsec3 {
    public static void main(String[] args) {
        //3. Ingrese el precio de compra y el precio de venta de un determinado producto. Calcule y muestre su beneficio.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese precio de compra y precio de venta y le diré el beneficio");
        System.out.print("Precio de compra:");
        double pc = teclado.nextDouble();
        if (pc > 0) {
            System.out.print("Precio de venta:");
            double pv = teclado.nextDouble();
            if (pv >= pc) {
                pv = pv - pc;
                System.out.println("El beneficio es de " + pv);
            } else {
                System.out.println("No puedes vender a perdidas");
            }
        } else {
            System.out.println("El precio tiene que ser mayor");
        }
    }
}
