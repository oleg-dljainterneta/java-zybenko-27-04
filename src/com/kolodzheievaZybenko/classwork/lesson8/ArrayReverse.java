package com.kolodzheievaZybenko.classwork.lesson8;


import java.io.IOException;

public class ArrayReverse {

  public static void main(String[] args) throws IOException {

    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      //numbers[i] = Integer.parseInt(READER.readLine());
    }

    for (int i = numbers.length - 1; i >= 0; i--) {
      System.out.println(numbers[i]);
    }

  }

}
