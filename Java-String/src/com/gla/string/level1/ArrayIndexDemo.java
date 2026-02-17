package com.gla.string.level1;

import java.util.Scanner;

public class ArrayIndexDemo {

    // Method to generate exception
    public static void generateException(String[] names) {
        System.out.println("Generating Exception...");
        System.out.println(names[names.length]); // Invalid index
    }

    // Method to handle exception
    public static void handleException(String[] names) {
        System.out.println("Handling Exception...");

        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Caught: " + e);
        }

        System.out.println("Program continues safely...");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
        }

        generateException(names);
        handleException(names);
    }
}
