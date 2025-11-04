package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация транспорта ===");
        Transport airplane = new Airplane();
        Transport ship = new Ship();

        System.out.println("Запуск двигателей:");
        airplane.startEngine();
        ship.startEngine();
    }
}