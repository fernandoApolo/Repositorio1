package com.clases.java.poo;

import java.util.ArrayList;

public class pruebas {
    public static void main(String[] args) {
      //Empleado emp=new Empleado("Fita","56864789W", "18/89/78","787989565",75.25,7888888);
      //Persona per=new Persona("Enano","888888888","98/25/79","4000000",8855.24);

      //emp.saludar();
      //per.saludar();
      //emp.trabajar();
      //emp.trabajar();
      //emp.trabajar();
      //per.robar(emp,400);
      //int opcion;
       // ArrayList<Integer> ListaEnteros=new ArrayList<>();
       // ListaEnteros.add(4);
       // ListaEnteros.add(8);
       // ListaEnteros.add(7);
       // ListaEnteros.add(23);
       // ListaEnteros.add(46);
       // ListaEnteros.add(56);
       // ListaEnteros.add(33);
       // ListaEnteros.add(58);
       // ListaEnteros.add(5);
       // ListaEnteros.add(9);
       // ListaEnteros.add(3);
       // ListaEnteros.add(0);
       // ListaEnteros.stream()
       //         .map(x-> x*2).filter(x-> x%2==0).forEach(x-> System.out.println(x));
        ArrayList<Persona> ListaPersonas = new ArrayList<>();
        Persona [] arrayPersona = new Persona[3];
        Persona p1= new Persona("Pepe","519095674W","18/10/1756","658670365",70.0);
        Persona p2= new Persona("Manolo","58776192L","20/1/1996","658670365",896.4);
        Persona p3= new Persona("Paco","74922166R","7/9/1999","658670365",-71.8);
        ListaPersonas.add(p1);
        ListaPersonas.add(p2);
        ListaPersonas.add(p3);
        ListaPersonas.stream().filter(x-> x.getNombre().startsWith("P")).map(x-> new Empleado(x.getNombre(), x.getDNI(),x.getFechaDenacimiento(),x.getNumTelefono(),x.getCantidadBanco(),20)).forEach(x-> x.saludar());

    }
}
