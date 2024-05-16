package com.clases.java.poo;


import java.util.ArrayList;
import java.util.Comparator;

public class ListaValores {
    private ArrayList<Integer> lista;
    public ListaValores(){
        lista=new ArrayList<>();
    }
    public ListaValores(int principio, int fin){
        lista=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {

        }
        lista.add(getRandomNumber(principio,fin));
    }
    private int getRandomNumber(int min, int max){
        return (int) ((Math.random()*(max-min))+min);
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }
    public void addToList(int entero){
        lista.add(entero);
    }
    public void addToList(ArrayList<Integer> lista){
        this.lista.addAll(lista);
    }
    public void ordenar(int n){
        lista.sort(Comparator.naturalOrder());
    }
    public void ordenar(){
            lista.sort(Comparator.reverseOrder());
        }
}
