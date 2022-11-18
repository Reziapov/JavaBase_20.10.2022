package com.hillel.reziapov.homeworks.homework11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//        Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.


        Scanner scanner = new Scanner(System.in);

        int scan;
        int scan2;

        System.out.println("Ведіть бажаний розмір рядків (М): ");
        while (true) {
            if (scanner.hasNextInt()) {
                scan = scanner.nextInt();
                System.out.println("Ваше число: " + scan);
                break;

            } else {
                System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ЧИСЛО");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        System.out.println("Ведіть бажаний розмір стовпців (N): ");
        while (true) {
            if (scanner.hasNextInt()) {
                scan2 = scanner.nextInt();
                System.out.println("Ваше число: " + scan2);
                System.out.println("Створено масив: " + scan + " на " + scan2);
                break;
            } else {
                System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ЧИСЛО");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        int[][] array = new int[scan][scan2];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("Траснпонування матриці");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int array2 = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = array2;
            }

        }
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();


        }
    }
}
