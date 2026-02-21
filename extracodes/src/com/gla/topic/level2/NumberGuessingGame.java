package com.gla.topic.level2;
import java.util.*;

public class NumberGuessingGame {

    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    public static int generateGuess() {
        return rand.nextInt(100) + 1;
    }

    public static String getFeedback(int guess) {
        System.out.print("Is " + guess + " High, Low, or Correct? ");
        return sc.nextLine().toLowerCase();
    }

    public static void playGame() {
        int guess;
        String feedback;

        do {
            guess = generateGuess();
            feedback = getFeedback(guess);
        } while (!feedback.equals("correct"));

        System.out.println("Yay! Computer guessed correctly 🎯");
    }

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100...");
        playGame();
    }
}