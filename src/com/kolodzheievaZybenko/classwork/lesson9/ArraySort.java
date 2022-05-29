package com.kolodzheievaZybenko.classwork.lesson9;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] numbers = new int[100000];
        fill(numbers);

        long start = System.currentTimeMillis();

       // bubbleSort(numbers);
        //Arrays.sort(numbers);

        long end = System.currentTimeMillis();

        System.out.println("time: " + (end - start));

        //System.out.println(Arrays.toString(numbers));

    }

    public static void fill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }

    // O(n^2)
    private static void bubbleSort(int[] numbers) {
        int n = numbers.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    //swap elements
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }
    }

}
