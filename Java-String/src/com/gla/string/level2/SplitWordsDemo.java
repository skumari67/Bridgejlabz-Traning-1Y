package com.gla.string.level2;
import java.util.Scanner;

public class SplitWordsDemo {

    public static String[] splitManual(String text) {
        int spaces = 0;

        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') spaces++;

        String[] words = new String[spaces + 1];

        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += ch;
            }
        }
        words[index] = word;

        return words;
    }

    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;

        for (int i = 0; i < a1.length; i++)
            if (!a1[i].equals(a2[i])) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] manual = splitManual(text);
        String[] builtIn = text.split(" ");

        System.out.println("Arrays Same? " + compareArrays(manual, builtIn));
    }
}
