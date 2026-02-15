package com.gla.array.level2;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input Section
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            service[i] = sc.nextDouble();

            // Validation
            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid Input! Please re-enter details.");
                i--; // Decrement index
                continue;
            }
        }

        // Calculation Section
        for (int i = 0; i < 10; i++) {

            if (service[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output Section
        System.out.println("\n--- Employee Bonus Details ---");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
        }

        System.out.println("\n--- Company Summary ---");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
