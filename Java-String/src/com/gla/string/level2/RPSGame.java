package com.gla.string.level2;
import java.util.Scanner;

public class RPSGame {

    public static String computerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    public static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;

        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper")))
            return 1;

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Games: ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Choice: ");
            String user = sc.next();

            String comp = computerChoice();
            int result = winner(user, comp);

            if (result == 1) userWins++;
            else if (result == -1) compWins++;
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
    }
}
