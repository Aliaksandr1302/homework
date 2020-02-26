package com.alex.double_array;

import com.alex.Utils;

public class DoubleArrayTask3 {

    public static void main(String[] args) {
        int[][] doubleArray = new int[5][5];
        for (int i = 0; i < doubleArray.length; i++) {
            int temp = 1;

            for (int j = 0; j < doubleArray[i].length; j++) {
                if (i == j) {
                    doubleArray[i][j] = 1;
                    temp = doubleArray[i][j];
                }
                if (j == i + temp || j == i - temp) {
                    temp++;
                    doubleArray[i][j] = temp;
                }
//                if (j == i - temp - temp) {
//                    doubleArray[i][j] = temp + temp + temp;
//                }
//                if (j == i - temp - temp - temp) {
//                    doubleArray[i][j] = temp + temp + temp + temp;
//                }
//                if (j == i - temp - temp - temp - temp) {
//                    doubleArray[i][j] = temp + temp + temp + temp + temp;
//                }
            }
        }
        Utils.printArray(doubleArray);
    }
}

