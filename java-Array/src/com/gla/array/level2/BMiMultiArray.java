package com.gla.array.level2;

import java.util.Scanner;

public class BMiMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        // [][0] = Weight, [][1] = Height, [][2] = BMI

        String[] weightStatus = new String[number];

        // Input Section
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter Height (m): ");
            personData[i][1] = sc.nextDouble();

            // Validation
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid Input! Enter positive values.");
                i--;
            }
        }

        // Calculation Section
        for (int i = 0; i < number; i++) {

            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Output Section
        System.out.println("\n--- BMI Report ---");

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0]);
            System.out.println("Height: " + personData[i][1]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }
    }
}
