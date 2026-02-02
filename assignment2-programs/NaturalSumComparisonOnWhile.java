
import java.util.Scanner;

class NaturalSumComparisonWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n > 0) {
            // Formula computation
            int formulaSum = n * (n + 1) / 2;
            
            // While loop computation
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            
            System.out.println("Sum using Formula: " + formulaSum);
            System.out.println("Sum using While Loop: " + loopSum);
            
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
        input.close();
    }
}