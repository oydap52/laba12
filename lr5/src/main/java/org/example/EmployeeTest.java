package org.example;

import org.example.domain.Employee;
import org.example.domain.Student;
import org.example.domain.Undergraduate;
import org.example.domain.Postgraduate;
import java.util.Scanner;

public class EmployeeTest {
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
        System.out.println("1 - Тест класса Employee");
        System.out.println("2 - Тест класса Student и наследников");
        System.out.println("0 - Выход");
    }

    private static void task1() {
        System.out.println("\n--- ЗАДАНИЕ 1 ---");
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSalary(120_345.27);
        emp.setSsn("012-34-5678");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee Salary: " + emp.getSalary());

        System.out.println("Всё с кайфом, брат");
        System.out.println("Нажми Enter, чтобы продолжить, брат");
        in.nextLine();
    }

    private static void task2() {
        System.out.println("\n--- ЗАДАНИЕ 2 ---");
        Student student = new Student("Илья", 20);
        Undergraduate undergrad = new Undergraduate("Макс", 19, "3-й курс");
        Postgraduate postgrad = new Postgraduate("Аня", 22, "Магистратура");

        System.out.println("Студент: " + student);
        System.out.println("Бакалавр: " + undergrad);
        System.out.println("Магистр: " + postgrad);

        System.out.println("Всё с кайфом, брат");
        System.out.println("Нажми Enter, чтобы продолжить, брат");
        in.nextLine();
    }
}