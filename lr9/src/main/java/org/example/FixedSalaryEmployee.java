package org.example;

public class FixedSalaryEmployee extends Employee {
    private double fixedSalary;

    public FixedSalaryEmployee(String name, String id, double fixedSalary) {
        super(name, id);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getMonthlySalary() {
        return fixedSalary;
    }
}