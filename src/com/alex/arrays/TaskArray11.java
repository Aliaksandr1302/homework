package com.alex.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArray11 {
    private static final Scanner scanner;

    public TaskArray11() {
    }

    public static void main(String[] args) {
        int[] array = new int[getIntFromConsole()];
        initRandomArray(array);
        printArray(array);
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

    static {
        scanner = new Scanner(System.in);
    }
}
