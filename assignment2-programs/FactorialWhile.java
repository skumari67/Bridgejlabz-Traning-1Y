
import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        if (n >= 0) {
            long factorial = 1;
            int i = 1;
            // Computation loop 
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial: " + factorial);
        }
        input.close();
    }
}