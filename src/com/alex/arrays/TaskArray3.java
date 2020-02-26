package com.alex.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArray3 {
    private static final Scanner scanner;

    public TaskArray3() {
    }

    public static void main(String[] args) {
        int lengthArray = getIntFromConsole();
        int[] array = new int[lengthArray];
        initRandomArray(array);
        printArray(array);
        arraySquared(array);
        printArray(array);
    }

    private static int getIntFromConsole() {
        while(!scanner.hasNextInt()) {
            scanner.next();
        }

        int output = scanner.nextInt();
        return output;
    }

    private static void initRandomArray(int[] array) {
        Random random = new Random();

        for(int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(9) + 1;
        }

    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    private static void arraySquared(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            array[i] *= array[i];
        }

    }

    static {
        scanner = new Scanner(System.in);
    }
}


