package org.example;

import java.io.*;

public class z1 {
    public static void main(String[] args) {
        String filename = "about_me.txt";
        String info = "Имя: Илья Суходольский\n" +
                "Возраст: 20 лет\n" +
                "Группа: Т-319\n" +
                "Увлечения: программирование, спорт";

        try (PrintWriter writer = new PrintWriter(new FileOutputStream(filename))) {
            writer.println(info);
            System.out.println("Файл '" + filename + "' успешно создан.");
        } catch (IOException e) {
            System.err.println("Ошибка создания файла: " + e.getMessage());
            return;
        }

        File file = new File(filename);
        if (file.exists()) {
            System.out.println("\n--- Информация о файле ---");
            System.out.println("Имя: " + file.getName());
            System.out.println("Размер: " + file.length() + " байт");
            System.out.println("Путь: " + file.getAbsolutePath());
            System.out.println("Можно читать: " + file.canRead());
            System.out.println("Можно писать: " + file.canWrite());
        }

        System.out.println("\n--- Содержимое файла ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}