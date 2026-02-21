package com.gla.topic.level2;
import java.util.*;

public class PalindromeDemo {

    public static String takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        return sc.nextLine();
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static void displayResult(boolean result) {
        System.out.println(result ? "Palindrome" : "Not Palindrome");
    }

    public static void main(String[] args) {
        String input = takeInput();
        displayResult(isPalindrome(input));
    }
}