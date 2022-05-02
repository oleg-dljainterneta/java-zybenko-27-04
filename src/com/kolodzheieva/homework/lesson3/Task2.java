package com.kolodzheieva.homework.lesson3;

public class Task2 {

  public static void main(String[] args) {


    //| a- b | / (a + b) ^3 - √c

    double a=2, b=5, c=6;
    double res;
    res = Math.abs(a-b) / Math.pow(a+b,3)-Math.sqrt(c);
    System.out.println("Result:" + res);



  }
}
