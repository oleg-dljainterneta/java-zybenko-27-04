package com.kolodzheievaZybenko.homework.lesson14.drink;

public class Drink {
    private final String name;
    protected int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void prepareDrink() {
        System.out.println("The drink is being prepared");
    }

    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + ", price = " + price;
    }
}
