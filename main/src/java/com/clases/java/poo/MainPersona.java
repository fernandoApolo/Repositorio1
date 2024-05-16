package com.clases.java.poo;

public class MainPersona {
    public static void main(String[] args) {
        Persona [] arrayPersona = new Persona[3];
        Persona p1= new Persona("Pepe","519095674W","18/10/1756","658670365");
        Persona p2= new Persona("Manolo","58776192L","20/1/1996","658670365");
        Persona p3= new Persona("Paco","74922166R","7/9/1999","658670365");
        System.out.println(p1.getNombre());
        System.out.println(p1.getDNI());
        arrayPersona [0]=p1;
        arrayPersona [1]=p2;
        arrayPersona [2]=p3;
        for (int i = 0; i < arrayPersona.length; i++) {
            if(i%2!=0) {
                System.out.println(arrayPersona[i].getNombre());
            }
        }
      //  System.out.println("Empieza el for eachhhhhhh");
      //  for (Persona p:arrayPersona) {
      //      System.out.println(p.getNombre());
      //      if (p.getNombre().length()==4){
      //          p.setNombre("Hijoputa");
      //      }
      //  }
      //  System.out.println("Fin de each");
        System.out.println(arrayPersona[0].getNombre());
        System.out.println(arrayPersona[1].getNombre());
        System.out.println(arrayPersona[2].getNombre());
        for (Persona p:arrayPersona) {
            p.setNombre(p.getNombre().replace("a","e").replace("A","E"));
        }
        System.out.println("Inicio un foreach de pintar");
        for (Persona P:arrayPersona ) {
            System.out.println(P.getNombre());
        }
    }
}
