package com.clases.java.poo;

public class Empleado extends Persona{
    private int numeroEmpleado;
    public Empleado(String Nombre, String DnI, String FechaDenacimiento, String NumTelefono, Double CantidadBanco,int nEmpleado) {
        super(Nombre, DnI, FechaDenacimiento, NumTelefono, CantidadBanco);
        numeroEmpleado=nEmpleado;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    public void saludar(){
        System.out.println("Hola soy "+super.getNombre()+" y mi número de empleado es "+numeroEmpleado+" y tengo ahorrado "+super.getCantidadBanco());
    }
    public void trabajar(){
        super.setCantidadBanco(super.getCantidadBanco()+30);
    }
    public void liarla(){
        super.setCantidadBanco((double) 0);
        setNumeroEmpleado(0);

    }
}
