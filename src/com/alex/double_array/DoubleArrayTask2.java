package com.alex.double_array;

import com.alex.Utils;

import java.util.Random;

public class DoubleArrayTask2 {

    private static final Random random = new Random();

    public static void main(String[] args) {
        int[][] doubleArray = new int[5][5];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = random.nextInt(20);
            }
        }

        Utils.printArray(doubleArray);

        int lengthArray = doubleArray[0].length + doubleArray[doubleArray.length - 1].length;
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            if (i < doubleArray[0].length) {
                array[i] = doubleArray[0][i];
            } else {
                array[i] = doubleArray[doubleArray.length - 1][i-doubleArray[doubleArray.length -1].length];
            }
        }
        Utils.printArray(array);

    }
}
