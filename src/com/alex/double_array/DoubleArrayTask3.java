package com.alex.double_array;

import com.alex.Utils;

public class DoubleArrayTask3 {

    public static void main(String[] args) {

        int[][] doubleArray = new int[9][9];

        int temp = 1;
        for (int i = 0; i < doubleArray.length; i++) {
            int j = 0;
            doubleArray[i][j] = temp;
            temp++;
        }
        for (int i = 0; i < doubleArray.length; i++) {
            int temp1 = doubleArray[i][0];
            int temp2 = 1;
            for (int j = 1; j < doubleArray[i].length; j++) {
                temp1--;
                doubleArray[i][j] = temp1;
                if(j>i){
                    temp2++;
                    doubleArray[i][j] = temp2;
                }
            }
        }
        Utils.printArray(doubleArray);
    }
}

