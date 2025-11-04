package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name) {
        this(name, "");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double calculateYearlySalary() {
        return salary * 12;
    }

    public double calculateYearlySalary(int years) {
        return salary * 12 * years;
    }

    public String getInfo(String type) {
        if (type.equals("полная")) {
            return "Имя: " + name + ", Фамилия: " + surname + ", Стаж: " + experienceInYears +
                    ", Уровень английского: " + englishLevel + ", Зарплата: " + salary;
        } else {
            return "Имя: " + name;
        }
    }

    public static String formatTesterInfo(String name, String surname) {
        return "Тестер: " + name + " " + surname;
    }

    @Override
    public String toString() {
        return "Tester{name='" + name + "', surname='" + surname + "', experienceInYears=" + experienceInYears +
                ", englishLevel='" + englishLevel + "', salary=" + salary + "}";
    }
}