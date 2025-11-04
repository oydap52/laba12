package org.example;

public class Ship extends Transport {
    @Override
    public void startEngine() {
        System.out.println("Корабль запускает двигатели.");
    }
}