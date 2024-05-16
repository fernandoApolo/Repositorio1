package com.clases.java.poo;

public class Persona {
    private String nombre;
    private String DNI;
    private String fechaDenacimiento;
    private String numTelefono;
    private Double cantidadBanco=0.0;
    public Persona(String Nombre, String DnI, String FechaDenacimiento, String NumTelefono,Double CantidadBanco){
    nombre=Nombre;
    DNI=DnI;
    fechaDenacimiento=FechaDenacimiento;
    numTelefono=NumTelefono;
    cantidadBanco=CantidadBanco;
    }public Persona(String Nombre, String DnI, String FechaDenacimiento, String NumTelefono){
    nombre=Nombre;
    DNI=DnI;
    fechaDenacimiento=FechaDenacimiento;
    numTelefono=NumTelefono;
    }

    public String getDNI() {
        return DNI;
    }

    public String getFechaDenacimiento() {
        return fechaDenacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setDNI(String DNI) {
        if (DNI.length()>=5){
            this.DNI = DNI;
        }
    }

    public void setFechaDenacimiento(String fechaDenacimiento) {
        this.fechaDenacimiento = fechaDenacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
    public void saludar(){
        System.out.println("Hola me llamo "+this.nombre+", nací el día "+this.fechaDenacimiento+
                ", mi dni es "+this.DNI+"  mi número de teléfono es "+this.numTelefono+" y tengo en el banco "+this.cantidadBanco);
    }

    public void setCantidadBanco(Double cantidadBanco) {
        this.cantidadBanco = cantidadBanco;
    }

    public Double getCantidadBanco() {
        return cantidadBanco;
    }
    public void robar(Persona p, double cantiadArobar){
        double dineroDelOtro = p.getCantidadBanco();
        p.setCantidadBanco(dineroDelOtro-cantiadArobar);
        System.out.println("Has robado "+cantiadArobar+" euros a "+p.getNombre()+", tu victima tiene ahora "+p.getCantidadBanco());
        setCantidadBanco(getCantidadBanco()+cantiadArobar);
        System.out.println("Tu como ladrón ahora tienes en total "+getCantidadBanco());
    }
}
