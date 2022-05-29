package com.kolodzheievaZybenko.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Zero {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the size of the array");
        int sizeArray = ArrayOptions.readNumber();
        System.out.println("Enter array data");
        int[] arrayConsole = ArrayOptions.createArrayAndFill(sizeArray);
        System.out.println("Entered array: " + Arrays.toString(arrayConsole));
        sortArray(arrayConsole);
        System.out.println("Sorted array: " + Arrays.toString(arrayConsole));

    }


    private static void sortArray(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}