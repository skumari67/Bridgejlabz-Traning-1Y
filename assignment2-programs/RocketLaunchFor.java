
import java.util.Scanner;

class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counterStart = input.nextInt();

        // For loop starting from user input down to 1
        for (int i = counterStart; i >= 1; i--) {
            System.out.println(i);
        }
        
        System.out.println("Liftoff!");
        input.close();
    }
}