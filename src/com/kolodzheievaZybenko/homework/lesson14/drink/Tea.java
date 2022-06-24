package com.kolodzheievaZybenko.homework.lesson14.drink;

public class Tea extends Drink {
    public Tea(String name,int price) {
        super(name, price);
    }

    @Override
    public void prepareDrink() {
        super.prepareDrink();
        System.out.println("Tea is ready");
    }
}