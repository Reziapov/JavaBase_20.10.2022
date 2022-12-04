package com.hillel.reziapov.homeworks.homework13;

public class Burger {

    String bread;
    String meat;
    String cheese;
    String salad;
    String mayonnaise;
    String doubleMeat;

    public Burger(String bread, String meat, String cheese, String salad, String mayonnaise) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        System.out.println("Standart Burger:" + " " + bread + ", " + meat + ", " + cheese
                                                                                 + ", " + salad + ", " + mayonnaise);
    }
    public Burger(String bread, String meat, String cheese, String salad) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        System.out.println("Diet Burger:" + " " + bread + ", " + meat + ", " + cheese + ", " + salad);
    }
    public Burger(String bread, String meat, String cheese, String salad, String mayonnaise, String doubleMeat) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;
        System.out.println("Double Meat Burger: " + bread + meat + ", "
                + doubleMeat + ", " + cheese + ", " + salad + ", " + mayonnaise);
    }
}



















