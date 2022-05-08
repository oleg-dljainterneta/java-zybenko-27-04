package com.kolodzheievaZybenko.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bag {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the length of your luggage: ");
    int lenght = Integer.parseInt(reader.readLine());

    System.out.println("enter the width of your luggage: ");
    int widht = Integer.parseInt(reader.readLine());

    System.out.println("enter the height of the luggage: ");
    int height = Integer.parseInt(reader.readLine());

    dimensionCalculation(lenght, widht, height);

  }
  public static int dimensionCalculation(int lenght, int widht, int height) {
    if (lenght <= 55 && widht <= 20 && height <= 40) {
      System.out.println("You can take hand luggage");
    } else if (lenght <= 53 && widht <= 22 && height <= 40){
      System.out.println("You can take hand luggage");
    } else {
      System.out.println("You can't take hand luggage");
    }
    return lenght;
  }
}
