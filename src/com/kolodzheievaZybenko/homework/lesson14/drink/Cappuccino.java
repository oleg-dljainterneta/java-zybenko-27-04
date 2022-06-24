package com.kolodzheievaZybenko.homework.lesson14.drink;

public class Cappuccino extends Drink {
    public Cappuccino(String name, int price) {
        super(name, price);
    }


    @Override
    public void prepareDrink() {
        super.prepareDrink();
        System.out.println("Cappuccino is ready");
    }
}