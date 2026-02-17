package com.gla.string.level3;
import java.util.Scanner;

public class UniqueCharacters {

    public static char[] uniqueChars(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < index; j++) {
                if (temp[j] == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) temp[index++] = ch;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] result = uniqueChars(text);

        System.out.print("Unique Characters: ");
        for (char ch : result) System.out.print(ch + " ");
    }
}
