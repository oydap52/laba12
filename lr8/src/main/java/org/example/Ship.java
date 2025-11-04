package org.example;

public class Ship implements Transport, Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Корабль запускает двигатели.");
    }

    @Override
    public void move() {
        System.out.println("Корабль плывёт по волнам.");
    }

    @Override
    public void stop() {
        System.out.println("Корабль бросает якорь.");
    }
}