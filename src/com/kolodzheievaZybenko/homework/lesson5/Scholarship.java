package com.kolodzheievaZybenko.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarship {

  public static void main(String[] args) throws IOException {

    BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter first grade: ");
    int firstGrade = Integer.parseInt(reader1.readLine());

    BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter second grade: ");
    int secondGrade = Integer.parseInt(reader2.readLine());

    BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the third grade: ");
    int thirdGrade = Integer.parseInt(reader3.readLine());

    BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the fourth grade: ");
    int fourthGrade = Integer.parseInt(reader4.readLine());

    BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the fifth grade: ");
    int fifthGrade = Integer.parseInt(reader5.readLine());

    double score = score(fifthGrade, secondGrade, thirdGrade, fourthGrade, fifthGrade);

    if (score >= 10) {
      System.out.println("your score: " + score + " - Increased scholarships");
    } else if (score < 10 && score >= 8) {
      System.out.println("your score: " + score + " - Standart scholarships");
    } else if (score < 8) {
      System.out.println("your score: " + score + " - You don't have a scholarship");
    }
  }

  public static double score(double first, double second, double third, double fourth,
      double fifth) {
    return (first + second + third + fourth + fifth) / 5;
  }

}
