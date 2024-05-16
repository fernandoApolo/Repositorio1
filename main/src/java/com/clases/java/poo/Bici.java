package com.clases.java.poo;

public class Bici implements InterfazVehiculo{
    @Override
    public double avanzar(double cuantoAvanzo) {
        return 0;
    }

    @Override
    public double avanzar(int cuantoAvanzo) {
        return cuantoAvanzo*2;
    }
}
