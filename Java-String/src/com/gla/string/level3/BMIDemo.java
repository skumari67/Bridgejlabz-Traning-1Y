package com.gla.string.level3;
import java.util.Scanner;

public class BMIDemo {

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(Math.round(bmi * 100) / 100.0);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    public static void display(String[][] result) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (String[] row : result)
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        display(computeBMI(data));
    }
}
