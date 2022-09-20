package ru.mirea.kvbo01.senkov;

public class Fahrenheit implements Convertable
{


    @Override
    public double convert(Celsium x) {
        return x.multiply((double)9/5)+32;
    }
}
