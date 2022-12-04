package com.hillel.reziapov.homeworks.homework13;

public class BurgerMain {
    public static void main(String[] args) {

        Burger standartBurger = new Burger("Bread", "Meat", "Cheese",
                                                                        "Salad", "Mayonnaise");
        Burger dietBurger = new Burger("Bread", "Meat", "Cheese", "Salad");
        Burger doubleMeat = new Burger("Bread", "",
                                       "Cheese", "Salad", "Mayonnaise", "Double Meat");

    }
}

