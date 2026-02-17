package com.gla.string.level1;
import java.util.Scanner;

public class StringIndexExceptionDemo {

    // Method to generate exception (no handling)
    public static void generateException(String text) {
        System.out.println("Generating Exception...");
        char ch = text.charAt(text.length()); // Invalid index
        System.out.println("Character: " + ch);
    }

    // Method to handle exception
    public static void handleException(String text) {
        System.out.println("Handling Exception...");

        try {
            char ch = text.charAt(text.length()); // Invalid index
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program continues safely...");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // First call → Program will crash
        generateException(text);

        // This line will never execute due to crash above
        handleException(text);
    }
}
