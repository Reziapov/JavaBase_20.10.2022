package com.hillel.reziapov.homeworks.homework9;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        final int counter = 25;

        int[] team1 = new int[counter];
        int[] team2 = new int[counter];

        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < counter; i++) {

            team1[i] = (int) (18 + (Math.random() * 23));
            team2[i] = (int) (18 + (Math.random() * 23));
        }
        for (int i = 0; i < counter; i++) {
            sum1 += team1[i];
            sum2 += team2[i];
        }

        System.out.println("_ПЕРША КОМАНДА_");
        System.out.println(Arrays.toString(team1));

        sum1 /= counter;

        System.out.println("Середній вік гравців: " + sum1);
        System.out.println();

        System.out.println("_ДРУГА КОМАНДА_");
        System.out.println(Arrays.toString(team2));

        sum2 /= counter;

        System.out.println("Середній вік гравців: " + sum2);
    }
}

