import java.util.Scanner;

public class Assignment_21{
        public static void main(String[] args) {
        final double rs = 84.38; // Exchange rate USD to INR
        final double dollar = 1/rs; // Exchange rate INR to USD

        Scanner sc = new Scanner(System.in);

        System.out.println("\nCurrency Converter (USD <-> INR)");
        System.out.print("Enter 1 to convert USD to INR: ");
        System.out.print("Enter 2 to convert INR to USD: ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.print("Enter amount in USD: ");
            double usd = sc.nextDouble();
            double inr = usd * rs;
            System.out.printf("Equivalent in INR: %.2f%n", inr);
        } else if (n == 2) {
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();
            double usd = inr * dollar;
            System.out.printf("Equivalent in USD: %.2f%n", usd);
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        sc.close();
    }
}
