package com.hillel.reziapov.homeworks.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВЕДІТЬ ІМ'Я ПЕРШОЇ КОМАНДИ");
        String nameFirstcommand = scanner.nextLine();

        int gamer1Team1 = 0;
        int gamer2Team1 = 0;
        int gamer3Team1 = 0;
        int gamer4Team1 = 0;
        int gamer5Team1 = 0;

        System.out.println("Ведіть числове значення фрагів для першого гравця: ");
        if (scanner.hasNextInt()) {
            gamer1Team1 = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для другого гравця: ");
        if (scanner.hasNextInt()) {
            gamer2Team1 = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для третього гравця: ");
        if (scanner.hasNextInt()) {
            gamer3Team1 = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для четвертого гравця: ");
        if (scanner.hasNextInt()) {
            gamer4Team1 = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для п'ятого гравця: ");
        if (scanner.hasNextInt()) {
            gamer5Team1 = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("ВЕДІТЬ ІМ'Я ДРУГОЇ КОМАНДИ");
        String nameSecondcommand = scanner.nextLine();

        int gamer1Team2 = 0;
        int gamer2Team2 = 0;
        int gamer3Team2 = 0;
        int gamer4Team2 = 0;
        int gamer5Team2 = 0;

        System.out.println("Ведіть числове значення фрагів для першого гравця: ");
        if (scanner.hasNextInt()) {
            gamer1Team2 = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для другого гравця: ");
        if (scanner.hasNextInt()) {
            gamer2Team2 = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для третього гравця: ");
        if (scanner.hasNextInt()) {
            gamer3Team2 = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для четвертого гравця: ");
        if (scanner.hasNextInt()) {
            gamer4Team2 = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для п'ятого гравця: ");
        if (scanner.hasNextInt()) {
            gamer5Team2 = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        double sum1 = (gamer1Team1 + gamer2Team1 + gamer3Team1 + gamer4Team1 + gamer5Team1) / 5.0;
        double sum2 = (gamer1Team2 + gamer2Team2 + gamer3Team2 + gamer4Team2 + gamer5Team2) / 5.0;

        if (sum1 > sum2) {
            System.out.println("Перемогла команда: " + nameFirstcommand + " набрала " + sum1 + " очків");
        } else if (sum1 < sum2) {
            System.out.println("Перемогла команда: " + nameSecondcommand + " набрала " + sum2 + " очків");
        } else {
            System.out.println("НІЧИЯ. ПЕРЕМОГЛА ДРУЖБА!");
            System.out.println("Команда " + nameFirstcommand + " набрала " + sum1 + " очків");
            System.out.println("Команда " + nameSecondcommand + " набрала " + sum2 + " очків");
        }

    }
}
