package com.gla.array.level2;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter Height (m): ");
            height[i] = sc.nextDouble();
        }

        // Calculation
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // Output
        System.out.println("\n--- BMI Report ---");

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + height[i]);
            System.out.println("Weight: " + weight[i]);
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
        }
    }
}
