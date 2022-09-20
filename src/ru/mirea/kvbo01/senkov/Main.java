package ru.mirea.kvbo01.senkov;

public class Main {
    public static void main(String[] args) {
        Celsium c = new Celsium(15);
        Fahrenheit f = new Fahrenheit();
        Kelvin k = new Kelvin();
        System.out.println(c+"\n В фаренгейтах= "+f.convert(c) + "\n В Кельвинах = " + k.convert(c));
    }
}