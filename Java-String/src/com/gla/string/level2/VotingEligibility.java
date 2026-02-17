package com.gla.string.level2;
public class VotingEligibility {

    public static int[] generateAges(int n) {
        int[] ages = new int[n];

        for (int i = 0; i < n; i++)
            ages[i] = (int)(Math.random() * 90);

        return ages;
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);

        System.out.println("Age\tCan Vote");
        for (int age : ages)
            System.out.println(age + "\t" + (age >= 18));
    }
}
