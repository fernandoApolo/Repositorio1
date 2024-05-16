package com.clases.java.poo;

public interface InterfazCalculadora {
    public double suma(double n1,double n2);
    public double resta(double n1,double n2);
    public double multiplicación(double n1,double n2);
    public double division(double n1,double n2) throws Exception;
    public void pintarMenu();
    public int recogerOpcion();
    public void ejecutar();
}
