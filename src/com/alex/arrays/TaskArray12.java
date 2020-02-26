package com.alex.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArray12 {
    private static final Scanner scanner;

    public TaskArray12() {
    }

    public static void main(String[] args) {
        int[] array = new int[getIntFromConsole()];
        initRandomArray(array);
        printArray(array);
        sortingArray(array);
        printArray(array);
        outputRepeatValue(array);
    }

    private static int getIntFromConsole() {
        int value;
        for(value = -1; value < 0; value = scanner.nextInt()) {
            while(!scanner.hasNextInt()) {
                scanner.next();
            }
        }

        return value;
    }

    private static void initRandomArray(int[] array) {
        Random random = new Random();

        for(int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(100);
        }

    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    private static int[] sortingArray(int[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            for(int j = 0; j < array.length - 1 - i; ++j) {
                int temp = array[j];
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    private static void outputRepeatValue(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array.length; ++j) {
                if (i != j && array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                }
            }
        }

    }

    static {
        scanner = new Scanner(System.in);
    }
}
