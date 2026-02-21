package com.gla.topic.level2;

import java.util.*;

public class MaxofThree {

    static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        int[] nums = new int[3];
        System.out.print("Enter three integers: ");
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int[] nums = takeInput();
        System.out.println("Maximum: " + findMax(nums[0], nums[1], nums[2]));
    }
}