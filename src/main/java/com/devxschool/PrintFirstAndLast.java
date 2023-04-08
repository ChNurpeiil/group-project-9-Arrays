package com.devxschool;

import java.util.Scanner;

public class PrintFirstAndLast {
    public static void main(String[] args) {
        /**
         * Given an array of String, iterate through each word
         * Print first and last letters of each element in a separate line
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 words please: ");
        String[] words = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};

        printLetters(words);
    }

    public static void printLetters(String[] words) {
        //TODO IMPLEMENT THIS METHOD
        for (int i = 0; i < words.length; i++){
            System.out.println("First and last letters of " + (i+1)+ " words ");
            System.out.println(words[i].charAt(0)+" and "+ words[i].charAt(words[i].length()-1));
        }


    }
}
