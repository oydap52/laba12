package org.example.domain;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 1: Ласка ===");
        Weasel weasel1 = new Weasel("Снежок", 2, "Серая", 0.4);
        Weasel weasel2 = new Weasel();

        System.out.println("Демонстрация ласки 1:");
        weasel1.eat();
        weasel1.hunt();
        weasel1.play();
        System.out.println("Цвет ласки 1: " + weasel1.color);
        System.out.println("Вес ласки 1: " + weasel1.weight);

        System.out.println("\nДемонстрация ласки 2:");
        weasel2.eat();
        weasel2.play();
        System.out.println("Цвет ласки 2: " + weasel2.color);


        System.out.println("\n=== Задание 2: Птица ===");
        Bird bird = new Bird("широкие", "острый");
        bird.fly();
        bird.land();
        bird.eat();
        bird.attack();
    }
}