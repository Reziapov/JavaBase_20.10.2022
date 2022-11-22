package com.hillel.reziapov.homeworks.homework11;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int scan;
        int scan2;

        System.out.println("Ведіть розмір рядків (М): ");
        while (true) {
            if (scanner.hasNextInt()) {
                scan = scanner.nextInt();
                if (scan > 1) {
                    System.out.println("Ваше число: " + scan);
                    break;
                } else {
                    System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ПОЗИТИВНЕ ЧИСЛО > 1");
                }
            } else {
                System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ЧИСЛО");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        System.out.println("Ведіть розмір стовпців (N)");

        while (true) {
            if (scanner.hasNextInt()) {
                scan2 = scanner.nextInt();
                if (scan2 > 1) {
                    System.out.println("Ваше число: " + scan2);
                    break;
                } else {
                    System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ПОЗИТИВНЕ ЧИСЛО > 1");
                }
            } else {
                System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ЧИСЛО");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        int[][] sourceMatrix = new int[scan][scan2];
        int[][] transposedMatrix = new int[scan2][scan];
        System.out.println("Створена матриця: " + scan + " на " + scan2);

        sourceMatrixWithFiller(sourceMatrix);
        System.out.println("Транспонована матриця: " + scan2 + " на " + scan);
        transposedMatrix(sourceMatrix, transposedMatrix);

    }
    static int[][] sourceMatrixWithFiller(int[][] sourceMatrix) {

        for (int i = 0; i < sourceMatrix.length; i++) {
            for (int j = 0; j < sourceMatrix[i].length; j++) {
                sourceMatrix[i][j] = (int) (Math.random() * 101);
                System.out.print(sourceMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        return sourceMatrix;
    }
    static int[][] transposedMatrix(int[][] sourceMatrix, int[][] transposedMatrix) {
        for (int i = 0; i < sourceMatrix.length; i++) {
            for (int j = 0; j < sourceMatrix[i].length; j++) {
                transposedMatrix[j][i] = sourceMatrix[i][j];
            }
        }
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        return transposedMatrix;

    }
}
