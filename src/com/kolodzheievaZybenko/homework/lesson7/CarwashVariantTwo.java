package com.kolodzheievaZybenko.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarwashVariantTwo {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("How many cars need to be washed");
    int numberOfDirtyCars = Integer.parseInt(in.readLine());

    washingProcess(numberOfDirtyCars);
    System.out.println("The cars are clean! \nGood luck =) ");
  }

  public static void washingProcess(int dirtyCars) {
    for (; dirtyCars > 0; dirtyCars--) {
      latherCars(dirtyCars);
      washCars(dirtyCars);
      dryCars(dirtyCars);
    }
  }

  public static void latherCars(int dirtyCars) {
    System.out.println("The car is washing, " + dirtyCars + " car(s) left");
  }

  public static void washCars(int dirtyCars) {
    System.out.println("The car is being washed, " + dirtyCars + " car(s) left");
  }

  public static void dryCars(int dirtyCars) {
    System.out.println("The car is drying, " + dirtyCars + " car(s) left");
  }
}