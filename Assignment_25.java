import java.util.Scanner;

// Program to validate a pass based on specific conditions

public class Assignment_25 {
   public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter a Password to validate:");
        String pass = n.nextLine();

        // Validate Password
        boolean letters = pass.matches(".*[a-zA-Z].*");
        boolean digits = pass.matches(".*\\d.*");
        boolean space = !pass.contains(" ");
        boolean plength = pass.length() > 8;

        if (letters && digits && space && plength) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. Ensure it is > 8 characters, contains letters and digits, and has no spaces.");
        }
    }
}