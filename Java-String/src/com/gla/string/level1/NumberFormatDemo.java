package com.gla.string.level1;
import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate exception
    public static void generateException(String text) {
        System.out.println("Generating Exception...");
        int num = Integer.parseInt(text); // May crash
        System.out.println("Number: " + num);
    }

    // Method to handle exception
    public static void handleException(String text) {
        System.out.println("Handling Exception...");

        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Caught: " + e);
        }

        System.out.println("Program continues safely...");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String text = sc.next();

        // First call → May crash
        generateException(text);

        // Will not execute if crash occurs above
        handleException(text);
    }
}
