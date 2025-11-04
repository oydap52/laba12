package org.example.domain;

public class Bird {
    private Krilya[] krilya;
    private Kluv kluv;

    public Bird(String kriloType, String kluvType) {
        this.krilya = new Krilya[2];
        this.krilya[0] = new Krilya(kriloType + " левое");
        this.krilya[1] = new Krilya(kriloType + " правое");
        this.kluv = new Kluv(kluvType);
    }
    public void fly() {
        for (Krilya wing : krilya) {
            wing.flap();
        }
        System.out.println("Птица летит.");
    }

    public void land() {
        System.out.println("Птица садится.");
    }

    public void eat() {
        kluv.peck();
        System.out.println("Птица питается.");
    }

    public void attack() {
        kluv.peck();
        System.out.println("Птица атакует.");
    }
}