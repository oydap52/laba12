package org.example.domain;

public class Kluv {
    private String shape;

    public Kluv(String shape) {
        this.shape = shape;
    }

    public void peck() {
        System.out.println("Клюет клювом формы " + shape + ".");
    }
}