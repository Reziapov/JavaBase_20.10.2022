package com.hillel.reziapov.homeworks.homework5;

public class Main {
    public static void main(String[] args) {
        //династія Лі
        int warrior1 = 13, archer1 = 24, rider1 = 46;
        int a = 860;
        int sum1 = (warrior1 + archer1 + rider1) * a;
        System.out.println("Загальна атака династії Лі: " + sum1);

        //династія Мінь
        int warrior2 = 9, archer2 = 35, rider2 = 12;
        double b = 1.5;
        int sum2 = (int) ((warrior2 + archer2 + rider2) * (a * b));
        System.out.println("Загальна атака династії Мінь: " + sum2);

    }
}
