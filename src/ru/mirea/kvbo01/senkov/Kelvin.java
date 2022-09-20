package ru.mirea.kvbo01.senkov;

public class Kelvin implements Convertable {


    @Override
    public double convert(Celsium x) {
        return x.add(273.15);
    }
}
