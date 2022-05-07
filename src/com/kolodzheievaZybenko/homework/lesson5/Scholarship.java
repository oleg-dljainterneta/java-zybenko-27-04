package com.kolodzheievaZybenko.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarship {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("enter first grade: ");
    int firstGrade = Integer.parseInt(reader.readLine());
    checkNumber(firstGrade);

    System.out.println("enter second grade: ");
    int secondGrade = Integer.parseInt(reader.readLine());
    checkNumber(secondGrade);

    System.out.println("enter the third grade: ");
    int thirdGrade = Integer.parseInt(reader.readLine());
    checkNumber(thirdGrade);

    System.out.println("enter the fourth grade: ");
    int fourthGrade = Integer.parseInt(reader.readLine());
    checkNumber(fourthGrade);

    System.out.println("enter the fifth grade: ");
    int fifthGrade = Integer.parseInt(reader.readLine());
    checkNumber(fifthGrade);

    int numberOfLessons = 5;

    double score = averageMark(firstGrade, secondGrade, thirdGrade, fourthGrade, fifthGrade,
        numberOfLessons);
    double scholarshipCalculation = scholarshipCalculation(score);

  }

  public static double averageMark(double first, double second, double third, double fourth,
      double fifth, int numberOfLessons) {
    return (first + second + third + fourth + fifth) / numberOfLessons;
  }

  public static double scholarshipCalculation(double score) {
    if (score >= 10) {
      System.out.println("your score: " + score + " - Increased scholarships");
    } else if (score < 10 && score >= 8) {
      System.out.println("your score: " + score + " - Standart scholarships");
    } else if (score < 8) {
      System.out.println("your score: " + score + " - You don't have a scholarship");
    }
    return score;
  }

  public static double checkNumber(double number) {
    if (number > 0 && number < 12) {
      return number;
    } else {
      System.out.println("Wrong data");
    }
    return number;
  }
}