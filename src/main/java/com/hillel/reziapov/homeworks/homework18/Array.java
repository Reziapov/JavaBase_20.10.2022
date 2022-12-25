package com.hillel.reziapov.homeworks.homework18;


public class Array {

    public static void dimensionalMatrix() {

        int matrix[][] = new int[5][5];

        double average;
        double sum = 0;
        int flag = 0;

        average = (matrix.length * matrix[0].length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
                System.out.print(matrix[i][j] + "\t");
                sum += matrix[i][j];
            }
            System.out.println();

        }
        System.out.println("Середнє арифметичне масива: " + sum / average);

        for (int k = 0; k < matrix.length; k++) {

            if (matrix.length != matrix[k].length) {
                System.out.println("Матриця не є квадратом");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Матриця квадратна");
        }
    }
}