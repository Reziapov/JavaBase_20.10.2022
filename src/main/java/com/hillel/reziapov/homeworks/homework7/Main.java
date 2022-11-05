package com.hillel.reziapov.homeworks.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//        Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВЕДІТЬ ЧИСЛО ВІД 0 ДО 10");
        int scan = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("ВАШЕ ЗНАЧЕННЯ: " + number);
                break;
            } else {
                System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ПОВТОРІТЬ ВВОД");
                scanner.nextLine();
            }
        }

            }
        }











