package org.example;

import java.util.List;

public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}