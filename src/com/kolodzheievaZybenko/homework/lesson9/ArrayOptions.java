package com.kolodzheievaZybenko.homework.lesson9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayOptions {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

    }

    public static int[] createArrayAndFill(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = readNumber();
        }
        return array;
    }

    public static int readNumber() {
        System.out.println("input number:");
        try {
            return Integer.parseInt(READER.readLine());
        } catch (Exception e) {
            System.out.println("incorrect input");
            return readNumber();
        }
    }

    public static int[] createArrayAndFillRandom(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static int[] createArrayAndFillMinMax(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = readNumber(min, max);
        }
        return array;
    }

    public static int readNumber(int min, int max) {
        System.out.println("input number:");
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < min || number > max) {
                System.out.println("input must be in range from " + min + " to " + max);
                return readNumber(min, max);
            }
            return number;
        } catch (Exception e) {
            System.out.println("incorrect input");
            return readNumber(min, max);
        }
    }

}

