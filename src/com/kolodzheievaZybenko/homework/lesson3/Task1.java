package com.kolodzheievaZybenko.homework.lesson3;

public class Task1 {

  public static void main(String[] args) {

    double radius1 = 1;
    double radius2 = 0.5;
    double radius3 = 0.2;
    double densityFactor = 0.7;
    double SnowmanWeight;

    double ballVolume1 = 4.0 / 3 * Math.PI * Math.pow(radius1, 3);
    double ballVolume2 = 4.0 / 3 * Math.PI * Math.pow(radius2, 3);
    double ballVolume3 = 4.0 / 3 * Math.PI * Math.pow(radius3, 3);

    double ballMass1 = densityFactor * ballVolume1;
    double ballMass2 = densityFactor * ballVolume2;
    double ballMass3 = densityFactor * ballVolume3;

    SnowmanWeight = ballMass1 + ballMass2 + ballMass3;
    System.out.println("Snowman weight " + SnowmanWeight);


  }
}
