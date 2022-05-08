package com.kolodzheievaZybenko.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarship {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("enter first grade: ");
    int firstGrade = Integer.parseInt(reader.readLine());

    System.out.println("enter second grade: ");
    int secondGrade = Integer.parseInt(reader.readLine());

    System.out.println("enter the third grade: ");
    int thirdGrade = Integer.parseInt(reader.readLine());

    System.out.println("enter the fourth grade: ");
    int fourthGrade = Integer.parseInt(reader.readLine());

    System.out.println("enter the fifth grade: ");
    int fifthGrade = Integer.parseInt(reader.readLine());

    int numberOfLessons = 5;

    if (!isGradesCorrect(firstGrade, secondGrade, thirdGrade, fourthGrade, fifthGrade)) {
      return;
    }

    double averageRating = averageMark(firstGrade, secondGrade, thirdGrade, fourthGrade, fifthGrade,
        numberOfLessons);
    double scholarshipCalculation = alculationScholarship(averageRating);

  }

  public static double averageMark(double first, double second, double third, double fourth,
      double fifth, int numberOfLessons) {
    return (first + second + third + fourth + fifth) / numberOfLessons;
  }

  public static double alculationScholarship(double score) {
    if (score >= 10) {
      System.out.println("your score: " + score + " - You have increased scholarships");
    } else if (score < 10 && score >= 8) {
      System.out.println("your score: " + score + " - You have regular scholarships");
    } else if (score < 8) {
      System.out.println(" your score: " + score + " - You don't have a scholarship");
    }
    return score;
  }

  private static boolean isGradesCorrect(int firstGrade, int secondGrade, int thirdGrade,
      int fourthGrade, int fifthGrade) {
    if (firstGrade < 0 || secondGrade < 0 || thirdGrade < 0 || fourthGrade < 0 || fifthGrade < 0) {
      System.out.println("Incorrect data entered ");
      return false;
    } else if (firstGrade > 12 || secondGrade > 12 || thirdGrade > 12 || fourthGrade > 12
        || fifthGrade > 12) {
      System.out.println("Incorrect data entered");
      return false;
    }
    return true;
  }
}