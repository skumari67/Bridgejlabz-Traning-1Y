
import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double enteredValue;
        
        // Loop until 0 is entered 
        while (true) {
            enteredValue = input.nextDouble();
            if (enteredValue == 0) break;
            total += enteredValue;
        }
        
        System.out.println("Total: " + total);
        input.close();
    }
}