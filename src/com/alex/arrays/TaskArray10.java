package com.alex.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArray10 {
    private static final Scanner scaner;

    public TaskArray10() {
    }

    public static void main(String[] args) {
        int[] array = new int[getIntFromConsole()];
        initRandomArray(array);
        printArray(array);
        flipArray(array);
        printArray(array);
    }

    private static int getIntFromConsole() {
        int i;
        for(i = -1; i < 0; i = scaner.nextInt()) {
            while(!scaner.hasNextInt()) {
                scaner.next();
            }
        }

        return i;
    }

    private static void initRandomArray(int[] araay) {
        Random random = new Random();

        for(int i = 0; i < araay.length; ++i) {
            araay[i] = random.nextInt(100);
        }

    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    private static int[] flipArray(int[] array) {
        for(int i = 0; i < array.length / 2; ++i) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        return array;
    }

    static {
        scaner = new Scanner(System.in);
    }
}
