package com.kolodzheievaZybenko.homework.lesson8;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FromLargeToSmallArrays {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int arraySize = ArrayOptions.readNumber();
        int[] array = ArrayOptions.createArrayAndFill(arraySize);
        ArrayOptions.print(array, "Entered array: ");
        ArrayOptions.print(divisionArray(array, 0, arraySize / 2), "first half");
        ArrayOptions.print(divisionArray(array, arraySize / 2, arraySize), "second half");
    }


    private static int[] divisionArray(int[] array, int indexFrom, int indexTo) {
        return Arrays.copyOfRange(array, indexFrom, indexTo);
    }


}
