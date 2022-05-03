package com.kolodzheievaZybenko.homework.lesson2.location;

public class Variable {

    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double temp;

        temp = b;
        b = a;
        a = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}