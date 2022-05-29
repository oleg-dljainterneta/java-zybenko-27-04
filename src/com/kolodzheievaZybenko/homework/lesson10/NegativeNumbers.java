package com.kolodzheievaZybenko.homework.lesson10;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

public class NegativeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines");
        int sizeArrayLines = ArrayOptions.readNumber();
        System.out.println("Enter the number of columns");
        int sizeArrayColumns = ArrayOptions.readNumber();
        System.out.println("Enter the minimum number to fill the array: ");
        int min = ArrayOptions.readNumber();
        System.out.println("Enter the maximum number to fill the array: ");
        int max = ArrayOptions.readNumber();
        int[][] array = createArrayAndFillTwoDimensionalMinMax(sizeArrayLines, sizeArrayColumns, min, max);
        ArrayOptions.printTwoDimensionalArray(array);
        printNegativeNumb(array);
    }

    public static int[][] createArrayAndFillTwoDimensionalMinMax(int sizeArrayLines, int sizeArrayColumns, int min, int max) {
        int[][] array = new int[sizeArrayLines][sizeArrayColumns];
        System.out.println("Filled array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (max - min) + min);
            }
        }
        return array;
    }

    private static void printNegativeNumb(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.println("Cell number: " + "[" + i + "]" + "[" + j + "]" + " number: " + array[i][j]);
                }
            }
        }
    }
}
