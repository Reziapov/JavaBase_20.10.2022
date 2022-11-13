package com.hillel.reziapov.homeworks.homework6;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan;
        System.out.println("ВЕДІТЬ ІМ'Я ПЕРШОЇ КОМАНДИ");
        String nameFirstcommand = scanner.nextLine();


        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            while (true) {
                if (scanner.hasNextInt()) {
                    scan = scanner.nextInt();
                    System.out.println("Кількість фрагів для першого гравця: ");
                    scan = scanner.nextInt();
                    System.out.println("Кількість фрагів для другого гравця: ");
                    scan = scanner.nextInt();
                    System.out.println("Кількість фрагів для третього гравця: ");
                    scan = scanner.nextInt();
                    System.out.println("Кількість фрагів для четвертого гравця: ");
                    scan = scanner.nextInt();
                    System.out.println("Кількість фрагів для п'ятого гравця: ");
                    break;
                } else {
                    System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ЧИСЛО");
                    scanner.nextLine();
                }
            }

        }
//        while (true) {
//            System.out.println("Ведіть числове значення фрагів для першого гравця: ");

//            while (true) {
//                if (scanner.hasNextInt()) {
//                    scan = scanner.nextInt();
//                    System.out.println("Кількість фрагів для першого гравця: " + scan);
//                    break;
//                } else {
//                    System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ЧИСЛО");
//                    scanner.nextLine();
//                }
//            }


    }


}

