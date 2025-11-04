package org.example;

public class Airplane extends Transport {
    @Override
    public void startEngine() {
        System.out.println("Самолет запускает турбины.");
    }
}