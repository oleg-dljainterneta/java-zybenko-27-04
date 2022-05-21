package com.kolodzheievaZybenko.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FromLargeToSmallArrays {

  static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {

    int[] array = new int[20];

    fillingArray(array);

    halfArray1(array);

    myArray2(array);
  }

  private static void myArray2(int[] array) {
    int[] myArray2 = Arrays.copyOfRange(array, array.length / 2, array.length);
    System.out.println("First second of the array:: " + Arrays.toString(myArray2));
  }

  private static void halfArray1(int[] array) {
    int[] halfArray1 = Arrays.copyOfRange(array, 0, array.length / 2);
    System.out.println("First half of the array:: " + Arrays.toString(halfArray1));
  }

  private static void fillingArray(int[] array) throws IOException {
    for (int i = 0; i < array.length; i++) {
      System.out.println("input " + i + " element: ");
      array[i] = Integer.parseInt(READER.readLine());
    }
  }
}
