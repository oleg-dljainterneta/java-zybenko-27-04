package com.kolodzheieva.homework.lesson3;

public class Task1 {

  public static void main(String[] args) {

    //Дано:
    double r1 = 1;   //радиус 1
    double r2 = 0.5; //радиус 2
    double r3 = 0.2; //радиус 3
    double k = 0.7;  //коєф плотности
    double m;        //маса

    //объем шара 4/3*pi*r^3
    double v1 = 4.0 / 3 * Math.PI * r1;
    double v2 = 4.0 / 3 * Math.PI * Math.pow(r2, 3);
    double v3 = 4.0 / 3 * Math.PI * Math.pow(r3, 3);

    //Плотность
    double k1 = k * v1;
    double k2 = k * v2;
    double k3 = k * v3;

    //Вес
    m = k1 + k2 + k3;
    System.out.println("Snowman weight " + m);


  }
}
