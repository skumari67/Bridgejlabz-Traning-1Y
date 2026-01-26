
import java.util.Scanner;

class Basiccalculatordouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user inputs for number1 and number2 [cite: 269]
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        
        // Perform Arithmetic Operations [cite: 270]
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        // Print the results [cite: 274]
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " 
            + multiplication + ", and " + division);
    }
}