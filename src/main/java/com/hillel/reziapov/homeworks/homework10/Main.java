package com.hillel.reziapov.homeworks.homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        final int counter = 7;
        int[] companyOrganizer = new int[counter];
        int[] gamer = new int[counter];

        for (int i = 0; i < counter; i++) {
            companyOrganizer[i] = (int) (Math.random() * 10);
            gamer[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(companyOrganizer);
        Arrays.sort(gamer);

        System.out.println(Arrays.toString(companyOrganizer));
        System.out.println(Arrays.toString(gamer));

        int num = 0;
        System.out.print("Збіглися індекси: ");
        for (int i = 0; i < counter; i++) {

            if (companyOrganizer[i] == gamer[i]) {
                num++;
                System.out.print(i + ", ");
            }
        }

        System.out.println();
        System.out.print("Кількість збігів: " + num);

    }
}



