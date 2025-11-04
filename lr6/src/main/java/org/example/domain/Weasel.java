package org.example.domain;

public class Weasel {
    private String name;
    protected int age;
    public String color;
    double weight;

    public Weasel(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public Weasel() {
        this.name = "Безымянная";
        this.age = 1;
        this.color = "Коричневая";
        this.weight = 0.5;
    }

    private void sleep() {
        System.out.println(name + " спит.");
    }

    protected void hunt() {
        System.out.println(name + " охотится.");
    }

    public void eat() {
        System.out.println(name + " ест.");
        sleep();
    }

    void play() {
        System.out.println(name + " играет.");
    }
}