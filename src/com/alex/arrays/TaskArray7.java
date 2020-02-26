package com.alex.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArray7 {
    private static final Scanner scanner;

    public TaskArray7() {
    }

    public static void main(String[] args) {
        int[] array = new int[getIntFromConsole()];
        initRandomArray(array);
        printArray(array);
        sortingArray(array);
        printArray(array);
        outputNoRepeatValue(array);
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

    private static void outputNoRepeatValue(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            if (hasRepeat(array, i)) {
                System.out.print(array[i] + " ");
            }
        }

    }

    private static boolean hasRepeat(int[] array, int element) {
        boolean temp = true;

        for(int i = 0; i < array.length; ++i) {
            if (i != element && array[i] == array[element]) {
                temp = false;
            }
        }

        return temp;
    }

    static {
        scanner = new Scanner(System.in);
    }
}
