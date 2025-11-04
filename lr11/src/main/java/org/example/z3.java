package org.example;

import java.io.*;

public class z3 {
    public static void main(String[] args) {
        String filename = "names.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Илья");
            writer.println("Носик");
            writer.println("Максосик");
            writer.println("Радик");
            writer.println("Велик");
            System.out.println("Файл '" + filename + "' создан.");
        } catch (IOException e) {
            System.err.println("Ошибка создания: " + e.getMessage());
            return;
        }

        File file = new File(filename);


        if (file.exists()) {
            System.out.println("Файл существует. Размер: " + file.length() + " байт");
        } else {
            System.out.println("Файл НЕ существует!");
            return;
        }


        try {
            if (file.delete()) {
                System.out.println("Файл успешно удалён.");
            } else {
                System.out.println("Не удалось удалить файл.");
            }
        } catch (SecurityException e) {
            System.err.println("Нет прав на удаление: " + e.getMessage());
        }


        System.out.println("Файл существует после удаления? " + file.exists());
    }
}