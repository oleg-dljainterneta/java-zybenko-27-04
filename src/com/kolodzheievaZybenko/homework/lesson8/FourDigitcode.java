package com.kolodzheievaZybenko.homework.lesson8;

public class FourDigitcode {

  public static void main(String[] args) {
    int number = 9407;
    int units = number % 10;
    System.out.println(units);
    int dozens = (number / 10) % 10;
    System.out.println(dozens);
    int hundreds = (number / 100) % 10;
    System.out.println(hundreds);
    int thosend = (number / 1000) % 10;
    System.out.println(thosend);

    int[] numbers = {thosend, hundreds, dozens, units};
    int counter = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j <= 9; j++) {
        counter++;
        if (numbers[i] == j) {
          System.out.println("your number: " + j);
          break;
        }

      }
    }
    System.out.println(counter);
  }

}
