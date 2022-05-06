package com.kolodzheievaZybenko.classwork.lesson5;

public class Truck {

  public static void main(String[] args) {

    int lenght =4;
    int widht = 4;
    int height = 2;
    int kg = 58;

    int volume = calculateVolme(lenght,widht,height);
    System.out.println(volume);

    //int totalWeight = totalWeight(volume,kg);
    //System.out.println(totalWeight);
    System.out.println(totalWeight(calculateVolme(lenght,widht,height),kg));

  }

  public static int calculateVolme (int lenght, int widht, int height){

    return lenght * widht * height;

  }

 public static int totalWeight(int volume, int kg){
    return volume * kg;
 }

}
