package com.gla.string.level2;
import java.util.Scanner;

public class WordLength2D {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) text.charAt(count++);
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitManual(String text) {
        return text.split(" "); // reuse allowed logic
    }

    public static String[][] wordWithLength(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = wordWithLength(splitManual(text));

        System.out.println("\nWord\tLength");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
