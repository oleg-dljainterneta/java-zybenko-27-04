package com.kolodzheievaZybenko.homework.lesson10;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TransposeMN {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.println("Enter the number of lines");
        int sizeArrayLines = ArrayOptions.readNumber();
        System.out.println("Enter the number of columns");
        int sizeArrayColumns = ArrayOptions.readNumber();
        int[][] array = ArrayOptions.createArrayAndFillTwoDimensional(sizeArrayLines, sizeArrayColumns);
        System.out.println("Array filled in manually: ");
        ArrayOptions.printTwoDimensionalArray(array);
        int[][] arrayTranspose = transposeArray(array, sizeArrayLines, sizeArrayColumns);
        System.out.println("\n" + "Transposed array: ");
        ArrayOptions.printTwoDimensionalArray(arrayTranspose);
    }

    private static int[][] transposeArray(int[][] array, int sizeArrayLines, int sizeArrayColumns) {
        int[][] transposeArray = new int[sizeArrayColumns][sizeArrayLines];
        for (int i = 0; i < transposeArray.length; i++) {
            for (int j = 0; j < transposeArray[i].length; j++) {
                transposeArray[i][j] = array[j][i];
            }
        }
        return transposeArray;
    }

}