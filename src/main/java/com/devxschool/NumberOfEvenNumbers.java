package com.devxschool;

import java.util.Scanner;

public class NumberOfEvenNumbers {
    public static void main(String[] args) {
        /**
         * Write a program that calculates a number of an even numbers in an array
         *
         * ex:
         * Enter numbers:
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * Number of even numbers are:3
         */
        //TODO WRITE YOUR CODE HERE
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int[] numbers = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        System.out.println(calculate(numbers));

    }


    public static int calculate(int[] numbers) {


        //TODO IMPLEMENT METHOD
        int var = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                var++;
            }
        }
        System.out.println("Number of even number are: ");
        return var;

    }
}