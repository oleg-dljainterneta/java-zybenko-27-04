package com.kolodzheievaZybenko.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bag {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("enter the length of your luggage: ");
    int length = Integer.parseInt(reader.readLine());

    System.out.println("enter the height of the luggage: ");
    int height = Integer.parseInt(reader.readLine());

    System.out.println("enter the width of your luggage: ");
    int width = Integer.parseInt(reader.readLine());

    boolean baggage = dimensionCalculationBaggage(length, height, width);

    String message = baggage ? "You can take a luggage " : "You can't take a luggage ";
    System.out.println(message);
  }

  public static boolean dimensionCalculationBaggage(int length, int height, int width) {
    if (length <= 55 && height <= 40 && width <= 20) {
      return true;

    } else {
      return length <= 40 && height <= 53 && width <= 22;
    }
  }
}