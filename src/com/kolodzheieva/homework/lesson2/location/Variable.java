package com.kolodzheieva.homework.lesson2.location;

public class Variable {

    public static void main(String[] args) {

        double a = 465465.42;
        double b = 36465.46;
        double temp;
        temp = b;
        b = a;
        a = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}