
import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Marks = " + average);

        if (average >= 75) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Excellent");
        } else if (average >= 60) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Good");
        } else if (average >= 50) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Average");
        } else {
            System.out.println("Grade: F");
            System.out.println("Remarks: Fail");
        }
    }
}
