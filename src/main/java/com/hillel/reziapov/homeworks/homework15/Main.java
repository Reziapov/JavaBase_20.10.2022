package com.hillel.reziapov.homeworks.homework15;

public class Main {
    public static void main(String[] args) {

        Androids androids = new Androids("Androids");
        Iphone iphone = new Iphone("iPhone");

        androids.printInfo();
        androids.internet();
        androids.call();
        androids.sms();
        androids.LinuxOS();
        System.out.println();
        iphone.printInfo2();
        iphone.internet();
        iphone.call();
        iphone.sms();
        iphone.iOS();


    }
}

