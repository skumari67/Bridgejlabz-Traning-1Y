package com.gla.string.level3;
import java.util.Scanner;

public class PalindromeDemo {

    public static boolean checkLoop(String text) {
        int start = 0, end = text.length() - 1;

        while (start < end)
            if (text.charAt(start++) != text.charAt(end--))
                return false;

        return true;
    }

    public static boolean checkRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;

        return checkRecursive(text, start + 1, end - 1);
    }

    public static boolean checkArray(String text) {
        char[] arr = text.toCharArray();

        for (int i = 0; i < arr.length / 2; i++)
            if (arr[i] != arr[arr.length - 1 - i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Loop Check: " + checkLoop(text));
        System.out.println("Recursive Check: " +
                checkRecursive(text, 0, text.length() - 1));
        System.out.println("Array Check: " + checkArray(text));
    }
}
