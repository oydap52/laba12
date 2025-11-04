package org.example;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            System.out.println("Введи номер задания (0 для выхода), брат: ");
            String choice = in.nextLine();

            switch (choice) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    task3();
                    break;
                case "4":
                    task4();
                    break;
                case "0":
                    System.out.println("Пока, брат!");
                    return;
                default:
                    System.out.println("Не с кайфом, брат, выбери нормальный номер!");
            }
            System.out.println();
        }
    }

    private static void showMenu() {
        System.out.println("Выбери задание, брат:");
        System.out.println("1 - Вывод Hello, ИМЯ");
        System.out.println("2 - Перегрузка конструкторов Tester");
        System.out.println("3 - Перегруженные методы Tester");
        System.out.println("4 - Вызов статического метода Tester");
        System.out.println("0 - Выход");
    }

    private static void task1() {
        System.out.println("\n--- ЗАДАНИЕ 1 ---");
        System.out.println("Введи имя, брат: ");
        String name = in.nextLine();
        Tester tester = new Tester(name, "", 0, "", 0.0);
        System.out.println("Hello, " + tester.getName());
        System.out.println("Всё с кайфом, брат");
        System.out.println("Нажми Enter, чтобы продолжить, брат");
        in.nextLine();
    }

    private static void task2() {
        System.out.println("\n--- ЗАДАНИЕ 2 ---");
        System.out.println("Конструктор 1: только имя");
        Tester tester1 = new Tester("Илья");
        System.out.println(tester1);
        System.out.println("Конструктор 2: имя и фамилия");
        Tester tester2 = new Tester("Илья", "Суходольский");
        System.out.println(tester2);
        System.out.println("Конструктор 3: все поля");
        Tester tester3 = new Tester("Илья", "Суходольский", 5, "B2", 50000.0);
        System.out.println(tester3);
        System.out.println("Всё с кайфом, брат");
        System.out.println("Нажми Enter, чтобы продолжить, брат");
        in.nextLine();
    }

    private static void task3() {
        System.out.println("\n--- ЗАДАНИЕ 3 ---");
        Tester tester = new Tester("Илья", "Суходольский", 5, "B2", 50000.0);
        System.out.println("Метод 1: Зарплата за год");
        System.out.println(tester.calculateYearlySalary());
        System.out.println("Метод 2: Зарплата за несколько лет");
        System.out.println(tester.calculateYearlySalary(2));
        System.out.println("Метод 3: Инфо о тестере");
        System.out.println(tester.getInfo("полная"));
        System.out.println("Всё с кайфом, брат");
        System.out.println("Нажми Enter, чтобы продолжить, брат");
        in.nextLine();
    }

    private static void task4() {
        System.out.println("\n--- ЗАДАНИЕ 4 ---");
        System.out.println("Вызов статического метода, брат:");
        String result = Tester.formatTesterInfo("Илья", "Суходольский");
        System.out.println(result);
        System.out.println("Вызов через другой класс, брат:");
        Caller.callStaticMethod();
        System.out.println("Всё с кайфом, брат");
        System.out.println("Нажми Enter, чтобы продолжить, брат");
        in.nextLine();
    }
}