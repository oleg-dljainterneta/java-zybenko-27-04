package com.kolodzheievaZybenko.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter first number: ");
    double number1 =  Integer.parseInt(in.readLine());
    System.out.println("Enter math action: ");
    char mathAction = in.readLine().charAt(0);
    System.out.println("Enter second number: ");
    int number2 =  Integer.parseInt(in.readLine());

    if (number2 == 0 && mathAction == '/') {
      System.out.println("Wrong math operation!");
      return;
    }

    double result = calculation(number1, number2, mathAction);
    System.out.println("solution: " + result);
  }

  static double calculation(double number1, double number2, char mathAction) {
    double result = 0;
    switch (mathAction) {
      case '+' -> result = number1 + number2;
      case '-' -> result = number1 - number2;
      case '*' -> result = number1 * number2;
      case '/' -> result = number1 / number2;
    }
    return result;
  }

}

