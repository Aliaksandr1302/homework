package com.alex.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArray8 {
    private static final Scanner scanner;
    private static int initValueRandomRange;
    private static int endValueRandomRange;
    private static int initRemoveRangeArray;
    private static int endRemoveRangeArray;

    public TaskArray8() {
    }

    public static void main(String[] args) {
        int[] array = new int[checkInputMoreZero()];
        System.out.println("Enter initValueRandomRange");
        initValueRandomRange = getIntFromConsole();
        System.out.println("Enter endValueRandomRange");
        endValueRandomRange = getEndRangeArray();
        System.out.println("Enter initRemoveRangeArray");
        initRemoveRangeArray = getInitialRemoveRangeArray();
        System.out.println("Enter endRemoveRangeArray");
        endRemoveRangeArray = getEndRemoveRangeArray();
        initRandomArray(array);
        printArray(array);
        sortingArray(array);
        int[] finalArray = initFinalArray(array);
        printArray(finalArray);
    }

    private static int getIntFromConsole() {
        while(!scanner.hasNextInt()) {
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static void initRandomArray(int[] array) {
        Random random = new Random();

        for(int i = 0; i < array.length; ++i) {
            array[i] = initValueRandomRange + random.nextInt(endValueRandomRange - initValueRandomRange);
        }

    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    private static int checkInputMoreZero() {
        int input;
        for(input = -1; input < 0; input = getIntFromConsole()) {
        }

        return input;
    }

    private static int getEndRangeArray() {
        int value = getIntFromConsole();
        if (initValueRandomRange > value) {
            value = getIntFromConsole();
        }

        return value;
    }

    private static int getInitialRemoveRangeArray() {
        int volume = getIntFromConsole();
        if (volume < initValueRandomRange || volume > endValueRandomRange) {
            volume = getIntFromConsole();
        }

        return volume;
    }

    private static int getEndRemoveRangeArray() {
        int volume = getIntFromConsole();
        if (volume > endValueRandomRange || volume < initRemoveRangeArray) {
            volume = getIntFromConsole();
        }

        return volume;
    }

    private static void sortingArray(int[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            for(int j = 0; j < array.length - 1 - i; ++j) {
                int temp = array[j];
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    private static int getLengthFinalArray(int[] array) {
        int volume = 0;

        for(int i = 0; i < array.length; ++i) {
            if (array[i] <= initRemoveRangeArray || array[i] >= endRemoveRangeArray) {
                ++volume;
            }
        }

        return volume;
    }

    private static int[] initFinalArray(int[] array) {
        int[] finalArray = new int[getLengthFinalArray(array)];

        int i;
        for(i = 0; i < array.length; ++i) {
            if (array[i] <= initRemoveRangeArray) {
                finalArray[i] = array[i];
            }
        }

        for(i = 0; i < array.length; ++i) {
            if (array[i] >= endRemoveRangeArray) {
                finalArray[i - (array.length - getLengthFinalArray(array))] = array[i];
            }
        }

        return finalArray;
    }

    static {
        scanner = new Scanner(System.in);
    }
}
