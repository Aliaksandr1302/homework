package com.alex.double_array;

import com.alex.Utils;

import java.util.Random;

public class DoubleArrayTask1 {
    public DoubleArrayTask1() {
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[][] doubleArray = new int[5][5];

        int temp;
        int i;
        for(temp = 0; temp < doubleArray.length; ++temp) {
            for(i = 0; i < doubleArray[temp].length; ++i) {
                doubleArray[temp][i] = random.nextInt(20);
            }
        }

        Utils.printArray(doubleArray);
        temp = doubleArray[0][0];

        for(i = 0; i < doubleArray.length; ++i) {
            if (temp < doubleArray[i][i]) {
                temp = doubleArray[i][i];
            }
        }

        System.out.println(temp);
    }
}
