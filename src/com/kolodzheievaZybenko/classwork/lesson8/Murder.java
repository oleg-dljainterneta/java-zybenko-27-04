package com.kolodzheievaZybenko.classwork.lesson8;

public class Murder {

  public static void main(String[] args) {

    int[] values = {20, 56, 67, 23, 40, 99, 1, 29, 78};

    int index = 0;
    int max = values[index];
    for (int i = 1; i < values.length; i++) {
      if (values[i] > max) {
        max = values[i];
        index = i;
      }
    }

    System.out.println(index + " murder " + max);
  }

}
