package com.alex.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArray6 {
    private static final Scanner scanner;

    public TaskArray6() {
    }

    public static void main(String[] args) {
        int lengthArray = getIntFromConsole();
        int[] array = new int[lengthArray];
        initRandomArray(array);
        printArray(array);
        sortingArray(array);
        int[] arrayBeforeAverage = initArrayBeforeAverage(array, lengthArrayBeforeAverage(array));
        printArray(arrayBeforeAverage);
    }

    private static int getIntFromConsole() {
        int input;
        for(input = -1; input < 0; input = scanner.nextInt()) {
            while(!scanner.hasNextInt()) {
                scanner.next();
            }
        }

        return input;
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

    private static double averageValueArray(int[] array) {
        double result = 0.0D;

        for(int i = 0; i < array.length; ++i) {
            result += (double)array[i];
        }

        result /= (double)array.length;
        return result;
    }

    private static int averageValueArrayToInt(int[] array) {
        int result;
        if (averageValueArray(array) % 2.0D == 0.0D) {
            result = (int)averageValueArray(array);
        } else {
            result = (int)averageValueArray(array) + 1;
        }

        return result;
    }

    private static int lengthArrayBeforeAverage(int[] array) {
        int lengthArrayBeforeAverage = 0;
        int average = (int)averageValueArray(array);

        for(int i = 0; i < array.length; ++i) {
            if (array[i] >= averageValueArrayToInt(array)) {
                lengthArrayBeforeAverage = i;
                break;
            }
        }

        return lengthArrayBeforeAverage;
    }

    private static int[] initArrayBeforeAverage(int[] array, int indexArrayBeforeAverage) {
        int length = array.length;
        if (indexArrayBeforeAverage > length) {
            System.out.println("WRONG INDEX");
            return null;
        } else {
            int[] arrayBeforeAverage = new int[indexArrayBeforeAverage];

            for(int i = 0; i < indexArrayBeforeAverage; ++i) {
                arrayBeforeAverage[i] = array[i];
            }

            return arrayBeforeAverage;
        }
    }

    static {
        scanner = new Scanner(System.in);
    }
}
