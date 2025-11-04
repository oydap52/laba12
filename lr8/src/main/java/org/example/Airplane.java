package org.example;

public class Airplane implements Transport, Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Самолёт запускает турбины.");
    }

    @Override
    public void move() {
        System.out.println("Самолёт взлетает и летит в небо.");
    }

    @Override
    public void stop() {
        System.out.println("Самолёт садится на взлётную полосу.");
    }
}