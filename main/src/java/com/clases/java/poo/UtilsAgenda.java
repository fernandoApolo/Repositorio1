package com.clases.java.poo;

import java.util.ArrayList;
import java.util.Scanner;

public class UtilsAgenda {
    public static void pintarMenu(){
        System.out.println("--------------");
        System.out.println("1º Añadir persona");
        System.out.println("2º Buscar persona");
        System.out.println("3º Lista de Favoritos");
        System.out.println("4º Lista de contactos");
        System.out.println("5º Borrar persona");
        System.out.println("6º Salir");
    }
    public static void añadirPersona(ArrayList<PersonaAgenda> lista){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ha elegido la función añadir persona");
        System.out.println("Dame el nombre, el número de teléfono,si es favorito o no, y el mail, todo ello separado por coomas");
        String result= teclado.nextLine();
        String[] splited=result.split(",");
        boolean favorito= false;
        if(splited[2].equalsIgnoreCase("Si")){
            favorito=true;
        }
        lista.add(new PersonaAgenda(splited[0],splited[1],favorito,splited[3]));
        System.out.println("Contacto guardado");
    }
    public static void Buscar(ArrayList<PersonaAgenda> lista){
        System.out.println("Has elegido la opción buscar");
        System.out.println("Introduce el nombre o número de teléfono");
        Scanner teclado = new Scanner(System.in);
        String result = teclado.nextLine();
        lista.stream().filter(x-> x.getNombre().contains(result)||x.getnTelefono().contains(result)).forEach(x-> x.saludar());
    }
    public static void ListaFavoritos(ArrayList<PersonaAgenda> lista){
        lista.stream().filter(x-> x.isFavorito()).forEach(x-> x.saludar());
    }
    public static void ListaTodos(ArrayList<PersonaAgenda> lista){
        lista.stream().forEach(x-> x.saludar());
    }

}
