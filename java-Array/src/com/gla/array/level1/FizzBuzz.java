package com.gla.array.level1;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        // Create String array
        String[] result = new String[number];

        // Fill array
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result[i - 1] = "FizzBuzz";
            else if (i % 3 == 0)
                result[i - 1] = "Fizz";
            else if (i % 5 == 0)
                result[i - 1] = "Buzz";
            else
                result[i - 1] = String.valueOf(i);
        }

        // Display results
        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }
    }
}
