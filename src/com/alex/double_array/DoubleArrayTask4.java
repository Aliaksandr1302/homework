package com.alex.double_array;

import com.alex.Utils;

public class DoubleArrayTask4 {

    public static void main(String[] args) {

        String[][] doubleArray = new String[5][5];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = "*";
            }
        }

        Utils.printArray(doubleArray);
        System.out.println("");
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                if (i == 0 && j == 0 || i == 0 && j == doubleArray[i].length - 1 ||
                        i == doubleArray.length - 1 && j == 0 ||
                        i == doubleArray.length - 1 && j == doubleArray[i].length - 1 ||
                        i == doubleArray.length / 2 && j == doubleArray[i].length / 2) {
                    doubleArray[i][j] = "o";
                }

            }
        }
        Utils.printArray(doubleArray);
    }
}
