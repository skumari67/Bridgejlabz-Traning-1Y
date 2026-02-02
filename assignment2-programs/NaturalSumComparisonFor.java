
import java.util.Scanner;

class NaturalSumComparisonFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;

            // Using for loop instead of while
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            System.out.println("Sum using Formula: " + formulaSum);
            System.out.println("Sum using For Loop: " + loopSum);
            
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
        input.close();
    }
}