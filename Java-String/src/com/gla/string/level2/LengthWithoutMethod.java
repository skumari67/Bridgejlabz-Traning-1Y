package com.gla.string.level2;
import java.util.Scanner;

public class LengthWithoutMethod {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.next();

        System.out.println("Manual Length: " + findLength(text));
        System.out.println("Built-in Length: " + text.length());
    }
}
