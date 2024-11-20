
// 

import java.util.Scanner;

public class Assignment_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for a float value
        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        // Converting float to integer using explicit casting
        int intValue = (int) floatValue;

        // Displaying the results
        System.out.println("Original float value: " + floatValue);
        System.out.println("Converted to integer: " + intValue);

        scanner.close(); // Closing the scanner
    }
}
