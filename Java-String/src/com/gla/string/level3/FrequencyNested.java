package com.gla.string.level3;
import java.util.Scanner;

public class FrequencyNested {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] arr = text.toCharArray();
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            freq[i] = 1;

            if (arr[i] == '0') continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }

        System.out.println("\nChar\tFrequency");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != '0')
                System.out.println(arr[i] + "\t" + freq[i]);
    }
}
