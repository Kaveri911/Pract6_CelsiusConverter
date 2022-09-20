package ru.mirea.kvbo01.senkov;

public class Celsium{
    private double x;
    public Celsium(double x) {
        this.x = x;
    }
    public double multiply (double y)
    {
        return this.x*y;
    }
public double add (double y)
{
    return this.x+y;
}

    @Override
    public String toString() {
        return "Градусов Цельсия= " +
                 + x ;
    }
}
