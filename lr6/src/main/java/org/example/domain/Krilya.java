package org.example.domain;

public class Krilya {
    private String type;

    public Krilya(String type) {
        this.type = type;
    }

    public void flap() {
        System.out.println("Машет крыльями типа " + type + ".");
    }
}