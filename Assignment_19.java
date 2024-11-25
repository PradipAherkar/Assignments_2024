
// Program to perform arithmetic operations on two numbers

import java.util.Scanner;

public class Assignment_19 {
    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double n1 = sc.nextDouble();

        System.out.println("Enter second number:");
        double n2 = sc.nextDouble();

        // Perform operations
        System.out.println("Addition: " + (n1 + n2));
        System.out.println("Subtraction: " + (n1 - n2));
        System.out.println("Multiplication: " + (n1 * n2));

        if (n2 != 0) {
            // Prevent division by zero
            System.out.println("Division: " + (n1 / n2));
            System.out.println("Modulus: " + (n1 % n2));
        } else {
            System.out.println("Division and modulus by zero are undefined.");
        }
    }
}