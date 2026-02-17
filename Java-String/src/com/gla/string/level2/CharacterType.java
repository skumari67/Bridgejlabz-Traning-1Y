package com.gla.string.level2;
import java.util.Scanner;

public class CharacterType {

    public static String check(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32;

        if (ch < 'a' || ch > 'z') return "Not a Letter";
        if ("aeiou".indexOf(ch) != -1) return "Vowel";
        return "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++)
            System.out.println(text.charAt(i) + " → " + check(text.charAt(i)));
    }
}
