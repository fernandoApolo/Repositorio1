package com.clases.java.programa2;

import java.util.Scanner;

public class ejercicioifelsesec11 {
    //15.En una dulcería se venden 4 tipos de sándwich, de acuerdo a la siguiente tabla:
    //Tipo Costo
    //1 = Moderado S/. 4,5
    //2 = Mediano S/. 5,0
    //3 = Extra grande S/. 7,5
    //4 = Full S/. 13,5
    //Calcule y muestre el monto total a pagar por un sándwich, sabiendo que, adicionalmente hay que pagar el 5% por el
    //servicio y 2% por propinas. Si se ingresa otro tipo de sándwich considerar costo = 0 y mostrar un mensaje de erro
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un tamaño del 1 al 4 y te diré el costo");
        int tipo= teclado.nextInt();
        double monto;
        double montoServicio;
        double montoPropina;
        String tamaño = null;
        switch (tipo){
            case 1:
                monto=4.5;
                tamaño="moderado";
                break;
            case 2:
                monto=5;
                tamaño="mediano";
                break;
            case 3:
                monto=7.5;
                tamaño="extragrande";
                break;
            case 4:
                monto=13.5;
                tamaño="full de todo";
                break;
            default:
                monto=0;
                System.out.println("La opción no es correcta ");
        }
        if(tipo<5&&tipo>0){
            System.out.println("El sandwich "+tamaño+" valdrá "+monto*1.07+" con servicio y propina incluida");
        }
    }
}