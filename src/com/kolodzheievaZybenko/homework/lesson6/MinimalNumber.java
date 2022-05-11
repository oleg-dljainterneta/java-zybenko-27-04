package com.kolodzheievaZybenko.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimalNumber {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the first number: ");
    int number1 = Integer.parseInt(reader.readLine());

    System.out.println("Enter the second number: ");
    int number2 = Integer.parseInt(reader.readLine());

    System.out.println("Enter the third number: ");
    int number3 = Integer.parseInt(reader.readLine());

    System.out.println("Minimal number: " + minimalNumber(number1, number2, number3));
  }

  public static int minimalNumber(int number1, int number2, int number3) {
    int minimalNumber = number1;
    if (number2 < minimalNumber) {
      minimalNumber = number2;
    }
    if (number3 < minimalNumber) {
      minimalNumber = number3;
    }
    return minimalNumber;
  }
}
