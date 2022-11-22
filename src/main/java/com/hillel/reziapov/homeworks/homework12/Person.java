package com.hillel.reziapov.homeworks.homework12;


public class Person {

    public static void main(String[] args) {
        String print1 = personInfo("Will", "Smith", "New York", "2936729462846");
        String print2 = personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        String print3 = personInfo("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(print1 + "\n" + print2 + "\n" + print3);

    }
    static String personInfo(String name, String lastName, String city, String number) {
        return "Зателефонувати громадянину " +
                name + " " + lastName + " із міста " + city + " можна за номером " + number;

    }
}

