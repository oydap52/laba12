package org.example;

import org.example.model.*;
import org.example.exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sotrudnik> sotrudniki = new ArrayList<>();

        System.out.println("=== Проверка OkladException в конструкторе ===");
        try {
            new ShtatnyiSotrudnik("Илья", "Менеджер", -5000, 1000);
        } catch (OkladException e) {
            String value = e.getMessage().substring(e.getMessage().indexOf(":") + 2);
            System.out.println("Невозможно создать сотрудника – указан отрицательный оклад: " + value);
            try {
                throw e;
            } catch (OkladException ex) {
                System.out.println("Перехвачено повторно: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Другая ошибка: " + e.getMessage());
        }

        System.out.println("\n=== Проверка PremiyaException ===");
        try {
            ShtatnyiSotrudnik maksos = new ShtatnyiSotrudnik("Максос", "Инженер", 60000, 15000);
            sotrudniki.add(maksos);
            System.out.println("Зарплата Максоса: " + maksos.rasschitatZarplatu());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            new ShtatnyiSotrudnik("Носик", "Бухгалтер", 50000, -5000);
        } catch (PremiyaException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
            try {
                ShtatnyiSotrudnik nosik = new ShtatnyiSotrudnik("Носик", "Бухгалтер", 50000, 0);
                sotrudniki.add(nosik);
                try {
                    nosik.setPremiya(-3000);
                } catch (PremiyaException ex) {
                    System.out.println("Ошибка установки премии: " + ex.getMessage());
                }
                System.out.println("Зарплата Носика: " + nosik.rasschitatZarplatu());
            } catch (Exception ex) {
                System.out.println("Не удалось создать: " + ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            ShtatnyiSotrudnik radik = new ShtatnyiSotrudnik("Радик", "Тестировщик", 40000, 5000);
            sotrudniki.add(radik);
            radik.setPremiya(-10000);
            radik.rasschitatZarplatu();
        } catch (PremiyaException e) {
            System.out.println("Перехвачено в main: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n=== Контрактник ===");
        try {
            SotrudnikPoKontraktu kontrakt = new SotrudnikPoKontraktu("Фрилансер", "Разработчик", 70000);
            sotrudniki.add(kontrakt);
            System.out.println("Зарплата: " + kontrakt.rasschitatZarplatu());
        } catch (OkladException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n=== Итог ===");
        for (Sotrudnik s : sotrudniki) {
            System.out.printf("%s (%s): %.2f%n", s.getFio(), s.getClass().getSimpleName(), s.rasschitatZarplatu());
        }
    }
}