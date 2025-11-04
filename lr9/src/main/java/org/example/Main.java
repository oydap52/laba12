package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("\n--- ЗАДАНИЕ 1: ПЛАНЕТЫ ---");
        Map<String, Planet> planetMap = new HashMap<>();
        planetMap.put("mars", new Mars("Марс"));
        planetMap.put("venus", new Venus("Венера"));
        planetMap.put("earth", new Planet("Земля"));

        System.out.println("Содержимое отображения (ключ → планета):");
        for (Map.Entry<String, Planet> entry : planetMap.entrySet()) {
            String key = entry.getKey();
            Planet planet = entry.getValue();
            System.out.println("Ключ: " + key + planet);
        }
        System.out.println("Нажми Enter, брат");
        in.nextLine();
    }

    private static void task2() {
        System.out.println("\n--- ЗАДАНИЕ 2: СТУДЕНТЫ ---");
        List<Student> students = new ArrayList<>();

        Map<String, Integer> grades1 = Map.of("Джава", 6, "БД", 3, "Практика", 8);
        Map<String, Integer> grades2 = Map.of("Джава", 5, "БД", 4, "Практика", 5);
        Map<String, Integer> grades3 = Map.of("Джава", 2, "БД", 2, "Практика", 1);

        students.add(new Student("Илья Суходольский", "Т-319", 3, grades1));
        students.add(new Student("Максим Лепешов", "Т-319", 2, grades2));
        students.add(new Student("Никита Новик", "Т-318", 1, grades3));

        System.out.println("Исходный список:");
        students.forEach(System.out::println);

        promoteStudents(students);

        System.out.println("\nПосле фильтрации и перевода:");
        students.forEach(System.out::println);

        System.out.println("\nСтуденты на 3-м курсе:");
        printStudents(students, 3);

        System.out.println("Нажми Enter, брат");
        in.nextLine();
    }

    private static void promoteStudents(List<Student> students) {
        students.removeIf(s -> s.getAverageGrade() < 3);
        students.forEach(s -> {
            if (s.getAverageGrade() >= 3) {
                s.setCourse(s.getCourse() + 1);
            }
        });
    }

    private static void printStudents(List<Student> students, int course) {
        students.stream()
                .filter(s -> s.getCourse() == course)
                .forEach(s -> System.out.println(s.getName()));
    }

    private static void task3() {
        System.out.println("\n--- ЗАДАНИЕ 3: СОТРУДНИКИ ---");
        System.out.println("Введи количество сотрудников, брат: ");
        int n = in.nextInt();
        in.nextLine();
        if (n <= 0) {
            System.out.println("Не с кайфом, брат, количество должно быть > 0");
            System.out.println("Нажми Enter, чтобы продолжить, брат");
            in.nextLine();
            return;
        }

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Сотрудник " + (i + 1) + ": фиксированная (f) или почасовая (h) оплата? ");
            String type = in.nextLine().toLowerCase();
            System.out.println("Введи имя: ");
            String name = in.nextLine();
            System.out.println("Введи ID: ");
            String id = in.nextLine();

            if (type.equals("f")) {
                System.out.println("Введи фиксированную зарплату: ");
                double salary = in.nextDouble();
                in.nextLine();
                employees.add(new FixedSalaryEmployee(name, id, salary));
            } else {
                System.out.println("Введи ставку в час: ");
                double rate = in.nextDouble();
                in.nextLine();
                employees.add(new HourlyEmployee(name, id, rate));
            }
        }

        List<Employee> sorted = employees.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nОтчет о зарплатах (от большего к меньшему):");
        sorted.forEach(System.out::println);

        System.out.println("\nПервые 5 имен:");
        sorted.stream().limit(5).forEach(e -> System.out.println(e.getName()));

        System.out.println("\nПоследние 3 ID:");
        int size = sorted.size();
        sorted.stream()
                .skip(Math.max(0, size - 3))
                .forEach(e -> System.out.println(e.getId()));

        System.out.println("Всё с кайфом, брат");
        System.out.println("Нажми Enter, чтобы продолжить, брат");
        in.nextLine();
    }
}