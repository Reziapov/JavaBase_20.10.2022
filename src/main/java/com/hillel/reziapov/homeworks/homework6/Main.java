package com.hillel.reziapov.homeworks.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
ввести ім'я першої команди
ввести кількість фрагів для 5-ти гравців першої команди (тобто має бути 5 змінних)
ввести ім'я другої команди
ввести кількість фрагів для 5-ти гравців другої команди (тобто має бути 5 змінних)
підрахувати середнє арифметичне балів кожної команди
порівняти результати команд та визначити переможця
вивести у консоль:
"Перемогла команда" + teamName + "набрала" + result + "очків"
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВЕДІТЬ ІМ'Я ПЕРШОЇ КОМАНДИ");
        String nameFirstcommand = scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для першого гравця: ");
        if (scanner.hasNextInt()) {
            int firstGamerfirstCommand = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для другого гравця: ");
        if (scanner.hasNextInt()) {
            int secondGamerfirstCommand = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для третього гравця: ");
        if (scanner.hasNextInt()) {
            int threeGamerfirstCommand = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для четвертого гравця: ");
        if (scanner.hasNextInt()) {
            int fourGamerfirstCommand = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для п'ятого гравця: ");
        if (scanner.hasNextInt()) {
            int fiveGamerfirstCommand = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("ВЕДІТЬ ІМ'Я ДРУГОЇ КОМАНДИ");
        String nameSecondcommand = scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для першого гравця: ");
        if (scanner.hasNextInt()) {
            int firstGamersecondCommand = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для другого гравця: ");
        if (scanner.hasNextInt()) {
            int secondGamersecondCommand = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для третього гравця: ");
        if (scanner.hasNextInt()) {
            int threeGamersecondCommand = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для четвертого гравця: ");
        if (scanner.hasNextInt()) {
            int fourGamersecondCommand = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Ведіть числове значення фрагів для п'ятого гравця: ");
        if (scanner.hasNextInt()) {
            int fiveGamersecondCommand = scanner.nextInt();
        } else {
            System.out.println("Невірний формат значення. Перезавантажте програму");
            System.exit(0);
        }
        scanner.nextLine();

//int sum1 = firstGamerfirstCommand + secondGamerfirstCommand;

        //System.out.println("Перемогла команда: " + sum1);
    }
}
