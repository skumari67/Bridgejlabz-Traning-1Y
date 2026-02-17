package com.gla.string.level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate exception
    public static void generateException(String text) {
        System.out.println("Generating Exception...");
        String sub = text.substring(5, 2); // Start > End
        System.out.println(sub);
    }

    // Method to handle exception
    public static void handleException(String text) {
        System.out.println("Handling Exception...");

        try {
            String sub = text.substring(5, 2); // Start > End
            System.out.println(sub);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Caught: " + e);
        }

        System.out.println("Program continues safely...");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // First call → Program crash
        generateException(text);

        // Will not execute due to crash above
        handleException(text);
    }
}
