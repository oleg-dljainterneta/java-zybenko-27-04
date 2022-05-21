package com.kolodzheievaZybenko.homework.lesson8;

public class Murder {

  public static void main(String[] args) {
    double[] killers = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9};
    double temp = 0;
    int killerNumber=-1;
    for (int i = 0; i < killers.length; i++) {
      if (killers[i] > temp) {
        temp = killers[i];
        killerNumber = i+1;
      }
    }
    System.out.println("The killer is: " + killerNumber);
  }

}
