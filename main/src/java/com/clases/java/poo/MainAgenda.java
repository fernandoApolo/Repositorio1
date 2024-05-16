package com.clases.java.poo;

import java.util.ArrayList;
import java.util.Scanner;

import static com.clases.java.poo.UtilsAgenda.*;

public class MainAgenda {
    public static void main(String[] args) {
        ArrayList<PersonaAgenda> lista = new ArrayList<>();
        PersonaAgenda p1=new PersonaAgenda("Pepe","64978546",true,"pepe@peppe");
        PersonaAgenda p2=new PersonaAgenda("Paco","6777126",false,"olgooo@peppe");
        PersonaAgenda p3=new PersonaAgenda("Manolo","66666666",true,"manolito@peppe");
        PersonaAgenda p4=new PersonaAgenda("Perico","77777777",true,"periquito@peppe");
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        boolean ejecutar = true;
        while (ejecutar) {
            Scanner teclado = new Scanner(System.in);
            pintarMenu();
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    añadirPersona(lista);
                case 2:
                    Buscar(lista);
                case 3:
                    ListaFavoritos(lista);
                case 4:
                    ListaTodos(lista);
             case 5:
                    ListaTodos(lista);
            }
        }
    }
}
