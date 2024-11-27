import java.util.Scanner;

// Program to check if a num lies between two given bounds

public class Assignment_22 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the num to check:");
        int num = n.nextInt();

        System.out.println("Enter the lower bound:");
        int lb = n.nextInt();

        System.out.println("Enter the upper bound:");
        int ub = n.nextInt();

        // Check range
        if (num > lb && num < ub) {
            System.out.println("The num " + num + " lies between " + lb + " and " + ub + ".");
        } else {
            System.out.println("The num " + num + " does not lie between " + lb + " and " + ub + ".");
        }
    }
}
