package org.example;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursPerMonth = 160;

    public HourlyEmployee(String name, String id, double hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getMonthlySalary() {
        return hourlyRate * hoursPerMonth;
    }
}