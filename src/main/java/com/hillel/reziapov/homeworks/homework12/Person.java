package com.hillel.reziapov.homeworks.homework12;

public class Person {

    public static void main(String[] args) {

        personInfo("Will Smith", "New York", "2936729462846");
        personInfo("Jackie Chan", "Shanghai", "12312412412");
        personInfo("Sherlock Holmes", "London", "37742123513");

    }

    static void personInfo(String name, String city, String number) {
        System.out.println("Зателефонувати громадянину " + name + " з міста " + city + " за номером " + number);

    }

}

