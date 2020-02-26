package com.alex;

import java.util.Scanner;

public class Utils {
    public static Scanner scanner;
    static {
        scanner = new Scanner(System.in);
    }

    public Utils() {
    }

    public static void printArray(int[] array) {
        int[] var1 = array;
        int var2 = array.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Object value = var1[var3];
            System.out.print(value + "\t");
        }

    }

    public static void printArray(int[][] array) {
        for(int i = 0; i < array.length; ++i) {
            printArray(array[i]);
            System.out.println();
        }

    }

    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            for(int j = 0; j < array.length - 1 - i; ++j) {
                if (array[j + 1] > array[j]) {
                    swapElements(array, j, j + 1);
                }
            }
        }

    }

    public static void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            int minElementIndex = i;

            for(int j = i + 1; j < array.length; ++j) {
                if (array[minElementIndex] > array[j]) {
                    minElementIndex = j;
                }
            }

            if (i != minElementIndex) {
                swapElements(array, minElementIndex, i);
            }
        }

    }
   public static void printArray(String[][] doubleArray){
        for(int i = 0; i < doubleArray.length; i++){
            System.out.println("");
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + "\t");
            }
        }
    }
}
