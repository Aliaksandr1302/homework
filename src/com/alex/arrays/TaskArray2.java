package com.alex.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArray2 {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public TaskArray2() {
    }

    public static void main(String[] args) {
        int lengthArray = getIntFromConsole();
        int[] array = new int[lengthArray];
        initRandomArray(array);
        printArray(array);
        sortingArray(array);
        System.out.println("Two minimum number in a array is " + array[0] + " " + twoMinimumNumberInArray(array));
    }

    private static int getIntFromConsole() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }

        int inpyt = scanner.nextInt();
        return inpyt;
    }

    private static void initRandomArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(100);
        }

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    private static int[] sortingArray(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = 0; j < array.length - 1 - i; ++j) {
                int temp = array[j];
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    private static String twoMinimumNumberInArray(int[] array) {
        int temp = array[0];
        String output = "";

        for (int i = 1; i < array.length - 1; ++i) {
            if (temp != array[i]) {
                output = Integer.toString(array[i]);
                break;
            }

            output = "All number array = " + Integer.toString(temp);
        }

        return output;
    }

}


