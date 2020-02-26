package com.alex.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArray1 {

    private static final Scanner scaner;

    static {
        scaner = new Scanner(System.in);
    }

    public TaskArray1() {
    }

    public static void main(String[] args) {
        System.out.println("Enter length array ");
        int indexArray = getIntFromConsole();
        int[] array = new int[indexArray];
        initRandomArray(array);
        printArray(array);
        sortingArray(array);
        System.out.println("the maximum odd number in a array is " + maxOddValueFromArray(array));
        System.out.println("the minimum even number in a array is " + minEvenValueFromArray(array));
    }

    private static int getIntFromConsole() {
        for (int i = -1; i < 0; i = scaner.nextInt()) {
            while (!scaner.hasNextInt()) {
                scaner.next();
            }
        }

        return scaner.nextInt();
    }

    private static void initRandomArray(int[] araay) {
        Random random = new Random();

        for (int i = 0; i < araay.length; ++i) {
            araay[i] = 30 + random.nextInt(70);
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

    private static String maxOddValueFromArray(int[] array) {
        String output = "";

        for (int i = array.length - 1; i > 0; --i) {
            if (array[i] % 2 != 0) {
                int value = array[i];
                output = Integer.toString(value);
                break;
            }

            output = "the array is missing odd number";
        }

        return output;
    }

    private static String minEvenValueFromArray(int[] array) {
        String output = "";

        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] % 2 == 0) {
                int value = array[i];
                output = Integer.toString(value);
                break;
            }

            output = "the array is missing even number";
        }

        return output;
    }
}
