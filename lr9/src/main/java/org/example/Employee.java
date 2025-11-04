package org.example;

public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract double getMonthlySalary();

    public String getName() { return name; }
    public String getId() { return id; }

    @Override
    public int compareTo(Employee o) {
        int salaryCompare = Double.compare(o.getMonthlySalary(), this.getMonthlySalary());
        if (salaryCompare != 0) return salaryCompare;
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + name + ", Зарплата: " + String.format("%.2f", getMonthlySalary());
    }
}