package com.kolodzheievaZybenko.homework.lesson14.drink;

public class Latte extends Drink {
    public Latte(String name, int price) {
        super(name,price);
    }

    @Override
    public void prepareDrink() {
        super.prepareDrink();
        System.out.println("Latte is ready");
    }
}