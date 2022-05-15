package com.kolodzheievaZybenko.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessTheNumber {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Guess the number from 1 to 10: ");

    int userNumber;
    int unknownNumber = (int) Math.floor(Math.random() * 10);

    do {
      System.out.print("Enter your number: ");
      userNumber = Integer.parseInt(reader.readLine());
      if (userNumber > unknownNumber) {
        System.out.println("Number must be less ");
      } else if (userNumber < unknownNumber) {
        System.out.println("Number must be greater ");
      } else {
        System.out.println("Congratulations you guessed it! ");
      }
    } while (userNumber != unknownNumber);
  }
}


