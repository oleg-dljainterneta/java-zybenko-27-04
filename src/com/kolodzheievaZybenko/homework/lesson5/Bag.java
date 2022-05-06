package com.kolodzheievaZybenko.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bag {

  public static void main(String[] args) throws IOException {

    BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter a lenght: ");
    int lenght = Integer.parseInt(reader1.readLine());

    BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter a widht: ");
    int widht = Integer.parseInt(reader2.readLine());

    BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter a height: ");
    int height = Integer.parseInt(reader3.readLine());

    if (lenght <= 55 && widht <= 22 && height <= 40) {
      System.out.println("You can take hand luggage");
    } else {
      System.out.println("You can't take hand luggage");
    }


  }


}
