package org.example;

import java.io.*;
import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        String filename = "tempa.txt";
        Scanner scanner = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            System.out.println("Введите 15 температур: " );
            for (int i = 1; i <= 15; i++) {
                System.out.print(i + ": ");
                double temp = scanner.nextDouble();
                writer.println(temp);
            }
            System.out.println("Температуры сохранены в " + filename);
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sum += Double.parseDouble(line.trim());
                count++;
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
            return;
        }

        System.out.printf("Средняя температура: %.2f°C\n", sum / count);
    }
}
