package com.alex.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArray9 {
    private static final Scanner scaner;

    public TaskArray9() {
    }

    public static void main(String[] args) {
        int[] array = new int[getIntFromConsole()];
        initRandomArray(array);
        printArray(array);
        sortingArray(array);
        printArray(array);
        outputVolumeArrayRange(array);
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
            araay[i] = random.nextInt(2);
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

    private static void outputVolumeArrayRange(int[] array) {
        for(int i = 1; i < array.length - 1; ++i) {
            if (array[0] == array[array.length - 1]) {
                System.out.println("Zero Volumes");
                break;
            }

            if (array[i] > array[0] && array[i] < array[array.length - 1]) {
                System.out.print(array[i] + " ");
            }
        }

    }

    static {
        scaner = new Scanner(System.in);
    }
}
