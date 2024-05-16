package com.clases.java.poo;

import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        Persona [] arrayPersona = new Persona[3];
        Persona p1= new Persona("Pepe","519095674W","18/10/1756","658670365");
        Persona p2= new Persona("Manolo","58776192L","20/1/1996","658670365");
        Persona p3= new Persona("Paco","74922166R","7/9/1999","658670365");
        // Array
        ArrayList<Persona> pepe= new ArrayList<>();
        pepe.add(p1);
        pepe.add(p2);
        pepe.add(p3);

       // for (int i = 0; i < pepe.size(); i++) {
       //    pepe.get(i).saludar();
       // }
        //for (Persona p:pepe ) {
        //   p.saludar();
        //}
  //      for (Persona p:pepe) {
  //          System.out.println(p.getNombre());
  //      }
  //      System.out.println("empieza foreach");
  //      pepe.forEach(p-> System.out.println(p.getNombre()));
  //      System.out.println("empieza stream");
  //      pepe.stream().filter(p-> !p.getNombre().startsWith("P")).forEach(p-> System.out.println(p.getNombre()));
        pepe.forEach(p-> p.robar(p2,200));
        p2.saludar();
   }
}
