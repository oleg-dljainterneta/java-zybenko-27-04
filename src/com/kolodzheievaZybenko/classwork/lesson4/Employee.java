package com.kolodzheievaZybenko.classwork.lesson4;

public class Employee {

  public static void main(String[] args) {

    int first = 3000;
    int second = 4500;
    int third = 5800;
    int monthYear = 12 * 10;

    int pay1 = first * monthYear;
    int pay2 = second * monthYear;
    int pay3 = third * monthYear;

    System.out.println("Annual fee first: " + pay1);
    System.out.println("Annual fee second: " + pay2);
    System.out.println("Annual fee third: " + pay3);

    double tax1 = pay1 * 0.05;
    System.out.println("Taxes for 10 years first: " + tax1);
    double tax2 = pay2 * 0.05;
    System.out.println("Taxes for 10 years second: " + tax2);
    double tax3 = pay3 * 0.05;
    System.out.println("Taxes for 10 years thied: " + tax3);

    double average1 = (pay1 - tax1) / monthYear;
    double average2 = (pay2 - tax3) / monthYear;
    double average3 = (pay3 - tax3) / monthYear;

    System.out.println("average1: " + average1);
    System.out.println("average2: " + average2);
    System.out.println("average3: " + average3);






  }

}
