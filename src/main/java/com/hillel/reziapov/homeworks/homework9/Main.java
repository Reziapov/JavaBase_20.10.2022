package com.hillel.reziapov.homeworks.homework9;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int sum1 = 0;

        for (int i = 0; i < team1.length; i++) {

            team1[i] = (int) (18 + (Math.random() * 23));
        }

        System.out.println("_ПЕРША КОМАНДА_");
        System.out.println(Arrays.toString(team1));

        for (int i = 0; i < team1.length; i++) {
            sum1 += team1[i];
        }
        sum1 /= team1.length;

        System.out.println("Середній вік гравців: " + sum1);
        System.out.println();

        int[] team2 = new int[25];
        int sum2 = 0;

        for (int i = 0; i < team2.length; i++) {

            team2[i] = (int) (18 + (Math.random() * 23));
        }
        System.out.println("_ДРУГА КОМАНДА_");
        System.out.println(Arrays.toString(team2));

        for (int i = 0; i < team2.length; i++) {
            sum2 += team2[i];
        }
        sum2 /= team2.length;

        System.out.println("Середній вік гравців: " + sum2);
    }
}

