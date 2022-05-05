package com.kolodzheievaZybenko.homework.lesson4;

import java.util.Scanner;

public class Animals {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of dogs, cats, feed weight, portion price");
    int dogs = scanner.nextInt();
    int cats = scanner.nextInt();
    int weight = scanner.nextInt();
    int price = scanner.nextInt();
    int day = 30;
    int perDay = 3;

    int foodDog = calculateFood(weight, day, perDay);
    System.out.println("Dog food per month: " + foodDog * dogs / 1000 + "Kg");

    int foodCat = calculateFood(weight, day, perDay);
    System.out.println("Cat food per month: " + foodCat * cats / 1000 + "Kg");

    int totalPrice = calculatePrice(day, perDay, price, dogs, cats);
    System.out.println("Shelter maintenance cost " + totalPrice + "$");

  }

  public static int calculateFood(int weight, int day, int perDay) {

    return weight * day * perDay;
  }

  public static int calculatePrice(int day, int perDay, int price, int dogs, int cats) {
    return day * perDay * price * (dogs + cats);
  }

}

