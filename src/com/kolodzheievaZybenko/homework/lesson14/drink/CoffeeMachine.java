package com.kolodzheievaZybenko.homework.lesson14.drink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoffeeMachine {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        ArrayList<Drink> drinks = createOrder();
        printOrderPrice(drinks);
        prepareDrink(drinks);
    }

    public static ArrayList<Drink> createOrder() throws IOException {

        System.out.println(" What drink would you like? \n AMERICANO, LATTE, CAPPUCCINO, TEA \n To exit - STOP");

        String input;
        ArrayList<Drink> drinks = new ArrayList<>();

        while (!(input = reader.readLine()).equalsIgnoreCase("STOP")) {
            try {
                System.out.println(" What drink would you like? or type stop ");
                drinks.add(chooseDrink(DrinkType.valueOf(input)));
            } catch (IllegalArgumentException e) {
                System.out.println("incorrect input");
            }
        }
        return drinks;
    }

    public static Drink chooseDrink(DrinkType type) {
        return switch (type) {
            case AMERICANO -> new Americano("Americano", 10);
            case LATTE -> new Latte("Latte", 20);
            case CAPPUCCINO -> new Cappuccino("Cappuccino", 30);
            case TEA -> new Tea("Tea", 10);
        };
    }


    public static void printOrderPrice(ArrayList<Drink> drinks) {
        int orderPrice = 0;
        for (Drink drink : drinks) {
            orderPrice += drink.getPrice();
            System.out.println("Drink price: " + drink.price);
        }

        System.out.println("The price of your order:  " + orderPrice);

    }

    public static void prepareDrink(ArrayList<Drink> drinks) {
        for (Drink drink : drinks) {
            drink.prepareDrink();

        }

    }
}