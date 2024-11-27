import java.util.Scanner;
public class Assignment_24 {
// Program to check if a year is a leap year using logical operators
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = n.nextInt();

        // Check leap year condition
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}