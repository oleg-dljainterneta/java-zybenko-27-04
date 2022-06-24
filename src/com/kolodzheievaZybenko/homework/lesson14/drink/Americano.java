package com.kolodzheievaZybenko.homework.lesson14.drink;

public class Americano extends Drink {


    public Americano(String name, int price) {
        super(name, price);
    }


    @Override
    public void prepareDrink() {
        super.prepareDrink();
        System.out.println("Americano is ready");
    }
}