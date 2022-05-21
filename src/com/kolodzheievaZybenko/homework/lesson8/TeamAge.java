package com.kolodzheievaZybenko.homework.lesson8;

import java.util.Arrays;

public class TeamAge {


  public static void main(String[] args) {
    int teamSize = 11;
    int[] firstTeam = new int[teamSize];
    int[] secondTeam = new int[teamSize];

    generateAges(firstTeam);
    System.out.println("Age of players of the first team:  " + Arrays.toString(firstTeam));

    generateAges(secondTeam);
    System.out.println("Age of players of the second team: " + Arrays.toString(secondTeam));

    int averageAgeFirstTeam = averageAgeCalculation(firstTeam);
    System.out.println(averageAgeFirstTeam);

    int averageAgeSecondTeam = averageAgeCalculation(secondTeam);
    System.out.println(averageAgeSecondTeam);

    commandAgeComparison(averageAgeFirstTeam, averageAgeSecondTeam);

  }

  private static int averageAgeCalculation(int[] team) {
    int sum = 0;
    for (int j : team) {
      sum = sum + j;
    }
    return sum / team.length;
  }

  private static void generateAges(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      double randomAge = Math.random();
      int max = 45;
      int min = 18;
      int age = (int) ((randomAge * (max - min)) + min);
      numbers[i] = age;
    }
  }

  public static void commandAgeComparison(int averageAgeFirstTeam, int averageAgeSecondTeam) {
    if (averageAgeFirstTeam < averageAgeSecondTeam) {
      System.out.println("The first team is younger than the second ");
    } else if (averageAgeFirstTeam > averageAgeSecondTeam) {
      System.out.println("The second team is younger than the first ");
    } else {
      System.out.println("Teams are the same age");
    }
  }
}

