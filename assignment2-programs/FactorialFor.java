
import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // Check if the input is a positive integer (Natural number)
        if (n >= 0) {
            long factorial = 1;
            // Using for loop to determine the factorial
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + n + " is: " + factorial);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }
        input.close();
    }
}