package com.kolodzheievaZybenko.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplesInJar {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number of apples: ");
    int totalApples = Integer.parseInt(reader.readLine());
    int applesInBigJar = 5;
    int applesInAverageJar = 3;
    int applesInSmallJar = 1;

    int numberOfLargeJars = countApplesBigJar(totalApples, applesInBigJar);
    System.out.println("Number of large jars " + numberOfLargeJars);
    int numberOfMediumJars = countApplesAverageJar(totalApples, applesInBigJar, applesInAverageJar);
    System.out.println("Number of medium cans " + numberOfMediumJars);
    int numberOfSmallJars = countApplesInSmallJar(totalApples, applesInBigJar, applesInAverageJar,
        applesInSmallJar);
    System.out.println("Number of small jars " + numberOfSmallJars);
  }

  public static int countApplesBigJar(int totalApples, int applesInBigJar) {
    return totalApples / applesInBigJar;
  }

  public static int countApplesAverageJar(int totalApples, int applesInBigJar,
      int applesInAverageJar) {
    return totalApples % applesInBigJar / applesInAverageJar;
  }

  public static int countApplesInSmallJar(int totalApples, int applesInBigJar,
      int applesInAverageJar, int applesInSmallJar) {
    return (((totalApples % applesInBigJar) % applesInAverageJar) / applesInSmallJar);
  }

}
