package com.kolodzheievaZybenko.homework.lesson13;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

import java.util.Arrays;

public class IndicesOfArrayElements {
    public static void main(String[] args) {
        System.out.println("Enter the number of cells in the array");
        int size = ArrayOptions.readNumber();
        int[] array = ArrayOptions.createArrayAndFillRandom(size);
        ArrayOptions.print(array, "Entered array:");
        int sum = ArrayOptions.readNumber();
        System.out.println(Arrays.toString(findNumbersWithSum(array, sum)));

    }

    public static int[] findNumbersWithSum(int[] numbers, int sum) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == sum)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
