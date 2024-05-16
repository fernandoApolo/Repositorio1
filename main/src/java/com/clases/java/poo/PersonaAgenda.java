package com.clases.java.poo;

public class PersonaAgenda {
    private String Nombre;
    private String nTelefono;
    private boolean favorito;
    private String mail;

    public PersonaAgenda(String nombre, String nTelefono, boolean favorito, String mail) {
        Nombre = nombre;
        this.nTelefono = nTelefono;
        this.favorito = favorito;
        this.mail = mail;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public void saludar(){
        System.out.println("Hola mi nombre es "+getNombre()+" mi número de teléfono es "+getnTelefono()+" , mi mail es "+getMail()+" y mi opción de favorito es");
    }
}
