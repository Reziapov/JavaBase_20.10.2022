package com.hillel.reziapov.homeworks.homework14;

public class Fitness {

    private final String name;
    String lastname;
    private final int number;
    private final int month;
    private int year;
    private final String email;
    private final long phone;
    double weigh;
    String pressure;
    int steps;
    private int a = 2020;

    public Fitness(String name, String lastname, int number, int month, int year, String email, long phone,
                   double weigh, String pressure, int steps) {
        this.name = name;
        this.lastname = lastname;
        this.number = number;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phone = phone;
        this.weigh = weigh;
        this.pressure = pressure;
        this.steps = steps;
    }

    int age = a - year;

    public int getAge() {
        age = a - year;
        return age;
    }

    void printAccountInfo() {
        System.out.println(name + " " + lastname + " Age:" + getAge() + " " + "(" + number + "." +
                month + "." + year + ") email: " + email + "; " + "phone: " + phone + "; weigh: " +
                weigh + "; " + " pressure: " + pressure + "; steps: " + steps);
    }
}
