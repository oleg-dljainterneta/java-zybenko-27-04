package com.kolodzheievaZybenko.homework.lesson10;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Enter factorial number:");
        int number = ArrayOptions.readNumber();
        System.out.println("Factorial number " + number + ": " + factorial(number));
    }

    public static int factorial(int number) {
        int result = 1;
        if (number == 1 || number == 0) {
            return result;
        }
        if (number < 0) {
            System.out.println("Why do you need the factorial of a negative number?");
            return 0;}

            result = number * factorial(number - 1);
            return result;
        }
    }
