package com.kolodzheievaZybenko.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lottery {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        int min = 0;
        int max = 9;
        System.out.println("Enter the size of the array");
        int sizeArray = ArrayOptions.readNumber();
        int[] arrayRandom = ArrayOptions.createArrayAndFillRandom(sizeArray);
        System.out.println("Enter number from " + min + " to " + max);
        int[] arrayConsole = ArrayOptions.createArrayAndFillMinMax(sizeArray, min, max);
        Arrays.sort(arrayRandom);
        Arrays.sort(arrayConsole);
        System.out.println("Random array:  " + Arrays.toString(arrayRandom));
        System.out.println("Entered array: " + Arrays.toString(arrayConsole));
        int coincided = searchForMatches(arrayRandom, arrayConsole);
        System.out.println("Number of coincidences:" + coincided);
    }


    public static int searchForMatches(int[] arrayRandom, int[] arrayConsole) {
        int coincided = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i] == arrayConsole[i]) {
                coincided++;
            }
        }
        return coincided;
    }


}
