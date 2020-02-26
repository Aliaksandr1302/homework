package com.alex.calculator;

import java.util.Scanner;

public class Calculator {
    static int plus = 43;
    static int minus = 45;
    static int multiply = 42;
    static int divide = 47;
    static int equally = 61;

    public Calculator() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eq = 0;
        System.out.println("Enter number1");

        while(!scanner.hasNextDouble()) {
            System.out.println("Enter number1");
            scanner.next();
        }

        double result = scanner.nextDouble();

        label81:
        while(eq != equally) {
            while(true) {
                String str;
                for(str = scanner.nextLine(); str.length() != 1; str = scanner.nextLine()) {
                    System.out.println("Enter action");
                }

                int action = str.charAt(0);
                if (action == plus || action == minus || action == multiply || action == divide || action == equally) {
                    double num = 0.0D;
                    if (action != equally) {
                        System.out.println("Enter number");

                        while(!scanner.hasNextDouble()) {
                            System.out.println("Enter number");
                            scanner.nextLine();
                        }

                        num = scanner.nextDouble();
                    }

                    if (action == plus) {
                        result += num;
                    } else if (action == minus) {
                        result -= num;
                    } else if (action == multiply) {
                        result *= num;
                    } else if (action == divide) {
                        result /= num;
                    } else if (action == equally) {
                        int var8 = equally;
                        break label81;
                    }
                } else {
                    System.out.println("Enter action");
                }
            }
        }

        if (result % 1.0D == 0.0D) {
            int res = (int)result;
            System.out.println("Calculation result " + res);
        } else {
            System.out.println("Calculation result " + result);
        }

    }
}
