//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
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
                case "3":
                    task3();
                    break;
                case "4":
                    task4();
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
        System.out.println("1 - Замена четных элементов на сумму соседей");
        System.out.println("2 - Возведение главной диагонали в квадрат");
        System.out.println("3 - Увеличение нечетных чисел");
        System.out.println("4 - Сумма элементов главной диагонали");
        System.out.println("0 - Выход");
    }

    private static void task1() {
        System.out.println("\n--- ЗАДАНИЕ 1 ---");
        System.out.println("Введи размер массива, брат: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Не с кайфом, брат, размер должен быть > 0");
            System.out.println("Нажми Enter, чтобы продолжить, брат");
            in.nextLine();
            return;
        }
        System.out.println("Введи a, брат: ");
        int a = in.nextInt();
        System.out.println("Введи b, брат: ");
        int b = in.nextInt();
        if (a < 0 || b >= n || a > b) {
            System.out.println("Не с кайфом, брат, a и b должны быть от 0 до " + (n-1) + " и a <= b");
            System.out.println("Нажми Enter, чтобы продолжить, брат");
            in.nextLine();
            return;
        }
        int[] array = new int[n];
        System.out.println("Сгенерированный массив, брат:");
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = a; i <= b; i++) {
            if (array[i] % 2 == 0) {
                int sum = 0;
                if (i > 0) sum += array[i-1];
                if (i < n-1) sum += array[i+1];
                array[i] = sum;
            }
        }
        System.out.println("Массив после замены, брат:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nВсё с кайфом, брат");
        System.out.println("Нажми Enter, чтобы продолжить, брат");
        in.nextLine();
    }

    private static void task2() {
        System.out.println("\n--- ЗАДАНИЕ 2 ---");
        System.out.println("Введи размер матрицы (N x N), брат: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Не с кайфом, брат, размер должен быть > 0");
            System.out.println("Нажми Enter, чтобы продолжить, брат");
            in.nextLine();
            return;
        }
        int[][] matrix = new int[n][n];
        System.out.println("Сгенерированная матрица, брат:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            matrix[i][i] *= matrix[i][i];
        }
        System.out.println("Матрица после возведения диагонали в квадрат, брат:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Всё с кайфом, брат");
        System.out.println("Нажми Enter, чтобы продолжить, брат");
        in.nextLine();
    }

    private static void task3() {
        System.out.println("\n--- ЗАДАНИЕ 3 ---");
        System.out.println("Введи размер массива, брат: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Не с кайфом, брат, размер должен быть > 0");
            System.out.println("Нажми Enter, чтобы продолжить, брат");
            in.nextLine();
            return;
        }
        int[] array = new int[n];
        System.out.println("Сгенерированный массив, брат:");
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int lastOdd = 0;
        boolean hasOdd = false;
        for (int i = n-1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                lastOdd = array[i];
                hasOdd = true;
                break;
            }
        }
        if (hasOdd) {
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 != 0) {
                    array[i] += lastOdd;
                }
            }
        }
        System.out.println("Массив после изменений, брат:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nВсё с кайфом, брат");
        System.out.println("Нажми Enter, чтобы продолжить, брат");
        in.nextLine();
    }
        private static void task4() {
        System.out.println("\n--- ЗАДАНИЕ 4 ---");
        System.out.println("Введи размер матрицы (M x M), брат: ");
        int m = in.nextInt();
        if (m <= 0) {
            System.out.println("Не с кайфом, брат, размер должен быть > 0");
            System.out.println("Нажми Enter, чтобы продолжить, брат");
            in.nextLine();
            return;
        }
        int[][] matrix = new int[m][m];
        System.out.println("Сгенерированная матрица, брат:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Сумма элементов главной диагонали: " + sum + ", брат");
        System.out.println("Всё с кайфом, брат");
        System.out.println("Нажми Enter, чтобы продолжить, брат");
        in.nextLine();
    }
}