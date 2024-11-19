
// Converting Integer Into Equivalent Character

import java.util.Scanner;
public class Assignment_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter an integer (0-127): ");
        int num = sc.nextInt();

        // Validating the range of input
        if (num >= 0 && num <= 127) {
            char character = (char) num; // Casting integer to character
            System.out.println("Equivalent character: " + character);
        } else {
            System.out.println("Please enter a valid integer between 0 and 127.");
        }

        sc.close();
    }
}