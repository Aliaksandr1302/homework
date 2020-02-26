package com.alex.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArray4 {
    private static final Scanner scanner;

    public TaskArray4() {
    }

    public static void main(String[] args) {
        int lengthArray = getIntFromConsole();
        char[] array = new char[lengthArray];
        initRandomCharArray(array);
        printArray(array);
        sortingArray(array);
        printArray(array);
    }

    private static int getIntFromConsole() {
        while(!scanner.hasNextInt()) {
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static void printArray(char[] array) {
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    private static void initRandomCharArray(char[] array) {
        Random random = new Random();

        for(int i = 0; i < array.length; ++i) {
            int temp = 97 + random.nextInt(25);
            array[i] = (char)temp;
        }

    }

    private static char[] sortingArray(char[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            for(int j = 0; j < array.length - 1 - i; ++j) {
                char temp = array[j];
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    static {
        scanner = new Scanner(System.in);
    }
}
