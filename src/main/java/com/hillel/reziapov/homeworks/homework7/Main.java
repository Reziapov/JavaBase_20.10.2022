package com.hillel.reziapov.homeworks.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int scan;
        System.out.println("ВЕДІТЬ ЧИСЛО ВІД 0 ДО 10");
        while (true) {
            if (scanner.hasNextInt()) {
                scan = scanner.nextInt();
                System.out.println("ВАШЕ ЧИСЛО: " + scan);
                break;
            } else {
                System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ЧИСЛО");
                scanner.nextLine();
            }
        }
        while (true) {
            int random = (int) (Math.random() * 11);
            //System.out.println("ЗНАЧЕННЯ КОМП'ЮТЕРА: " + random);
            if (scan == random) {
                System.out.println("ВІТАЮ! ВИ ВГАДАЛИ!");
                break;
            } else {
                System.out.println("У ВАС ЗАЛИШИЛОСЬ ДВІ СПРОБИ");
                System.out.println("ВЕДІТЬ ЧИСЛО ВІД 0 ДО 10");
                scanner.nextLine();

                while (true) {
                    if (scanner.hasNextInt()) {
                        scan = scanner.nextInt();
                        System.out.println("ВАШЕ ЧИСЛО: " + scan);
                        break;
                    } else {
                        System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ЧИСЛО");
                        scanner.nextLine();
                    }
                }
            }
            //System.out.println("ЗНАЧЕННЯ КОМП'ЮТЕРА: " + random);
            if (scan == random) {
                System.out.println("ВІТАЮ! ВИ ВГАДАЛИ!");
                break;
            } else {
                System.out.println("У ВАС ЗАЛИШИЛОСЬ ОДНА СПРОБА");
                System.out.println("ВЕДІТЬ ЧИСЛО ВІД 0 ДО 10");
                scanner.nextLine();

                while (true) {
                    if (scanner.hasNextInt()) {
                        scan = scanner.nextInt();
                        System.out.println("ВАШЕ ЧИСЛО: " + scan);
                        break;
                    } else {
                        System.out.println("НЕВІРНЕ ЗНАЧЕННЯ. ВЕДІТЬ ЧИСЛО");
                        scanner.nextLine();
                    }
                }
            }
            System.out.println("ЗНАЧЕННЯ КОМП'ЮТЕРА: " + random);
            if (scan == random) {
                System.out.println("ВІТАЮ! ВИ ВГАДАЛИ!");
                break;
            } else {
                System.out.println("ВИ ПРОГРАЛИ! СПРОБУЙТЕ ЩЕ!");
                break;
            }
        }
    }
}
