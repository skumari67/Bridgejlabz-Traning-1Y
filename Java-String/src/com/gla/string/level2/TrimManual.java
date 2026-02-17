package com.gla.string.level2;
import java.util.Scanner;

public class TrimManual {

    public static String trimManual(String text) {
        int start = 0, end = text.length() - 1;

        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;

        String result = "";
        for (int i = start; i <= end; i++)
            result += text.charAt(i);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Manual Trim: [" + trimManual(text) + "]");
        System.out.println("Built-in Trim: [" + text.trim() + "]");
    }
}
