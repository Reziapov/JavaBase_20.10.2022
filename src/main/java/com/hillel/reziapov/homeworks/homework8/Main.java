package com.hillel.reziapov.homeworks.homework8;

public class Main {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; i <= 155; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9
                    || i / 10 == 14 || i / 10 == 19 || i % 10 == 14 || i % 10 == 19) {
                continue;
            }
            System.out.println("shuttle number: " + i);
            counter++;
        }
        System.out.println(counter);
    }
}
