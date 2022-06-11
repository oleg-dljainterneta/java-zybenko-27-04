package com.kolodzheievaZybenko.homework.lesson13;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

import java.util.Arrays;

public class ShiftRight {
    public static void main(String args[]) {
        System.out.println("Enter the number of cells in the array");
        int size = ArrayOptions.readNumber();
        int[] array = ArrayOptions.createArrayAndFill(size);
        ArrayOptions.print(array, "Entered array:");
        int n = ArrayOptions.readNumber();
        System.out.println("Array         " + Arrays.toString(array));
        int[]arrayShift = shiftToRight(array,n);
        ArrayOptions.print(arrayShift, "Shifted to: "+ n);
    }

    public static int[] shiftToRight(int[] array, int n) {

        for (int i = 0; i < n; i++) {
            int temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }
        return array;


    }
}