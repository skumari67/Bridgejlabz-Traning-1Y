package com.gla.array.level2;

import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        // [][0]=Physics, [][1]=Chemistry, [][2]=Maths

        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextDouble();

                if (marks[i][j] < 0) {
                    System.out.println("Invalid Marks! Re-enter student data.");
                    i--;
                    break;
                }
            }
        }

        // Calculation
        for (int i = 0; i < n; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 50)
                grade[i] = "C";
            else
                grade[i] = "Fail";
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }
    }
}
