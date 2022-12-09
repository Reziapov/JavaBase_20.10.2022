package com.hillel.reziapov.homeworks.homework15;

public class Main {
    public static void main(String[] args) {

        Androids androids = new Androids("Androids");
        Iphone iphone = new Iphone("iPhone");

        if (androids != null) {
            androids.printInfo();
            if (androids instanceof Smartphones)
                ((Smartphones) androids).internet();
            if (androids instanceof Smartphones)
                ((Smartphones) androids).call();
            if (androids instanceof Smartphones)
                ((Smartphones) androids).sms();
            if (androids instanceof LinuxOS)
                ((LinuxOS) androids).LinuxOS();
        }
        System.out.println();

        if (iphone != null) {
            iphone.printInfo2();
            if (iphone instanceof Smartphones)
                ((Smartphones) iphone).internet();
            if (iphone instanceof Smartphones)
                ((Smartphones) iphone).call();
            if (iphone instanceof Smartphones)
                ((Smartphones) iphone).sms();
            if (iphone instanceof IOS)
                ((IOS) iphone).iOS();
        }

    }
}

