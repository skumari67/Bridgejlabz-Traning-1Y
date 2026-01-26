
import java.util.Scanner;

class DivisionResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        
        int quotient = number1 / number2;
        int reminder = number1 % number2;
        
        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + 
            " of two numbers " + number1 + " and " + number2);
    }
}