package com.kolodzheievaZybenko.homework.lesson13;

import com.kolodzheievaZybenko.homework.lesson9.ArrayOptions;

import java.util.Arrays;

public class ShiftRightLeft {
    public static void main(String args[]) {
        System.out.println("Enter the number of cells in the array");
        int size = ArrayOptions.readNumber();
        int[] array = ArrayOptions.createArrayAndFill(size);
        ArrayOptions.print(array, "Entered array: ");
        int shift = ArrayOptions.readNumber();
        System.out.println("The original array" + Arrays.toString(array));
        int[] copy = shiftLeftRight(array,shift);
        ArrayOptions.print(copy,"Shifted array to "+shift);
    }

    public static int[] shiftLeftRight(int[] array, int shift) {
        shift = shift < 0 ? (array.length + shift) : shift;
        int[] tempArray = new int[array.length];
        System.arraycopy(Arrays.copyOfRange(array, array.length - shift, array.length), 0, tempArray, 0, shift);
        System.arraycopy(Arrays.copyOfRange(array, 0, array.length - shift), 0, tempArray, shift, tempArray.length - shift);
        return tempArray;
    }
}
