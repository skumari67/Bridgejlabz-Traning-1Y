import java.util.Scanner;

class SumZeroOrUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        
        // Infinite while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double enteredValue = input.nextDouble();
            
            // Check if user entered 0 or a negative number to break the loop
            if (enteredValue <= 0) {
                break;
            }
            total += enteredValue;
        }
        
        System.out.println("The total sum is: " + total);
        input.close();
    }
}