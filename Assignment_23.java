import java.util.Scanner;

// Program to check if three side lengths can form a triangle

public class Assignment_23 {
   public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the first side length:");
        double s1 = n.nextDouble();

        System.out.println("Enter the second side length:");
        double s2 = n.nextDouble();

        System.out.println("Enter the third side length:");
        double s3 = n.nextDouble();

        // Check triangle inequality theorem
        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            System.out.println("The given sides form a valid triangle.");
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }
}