import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of A: ");
        int ageA = scanner.nextInt();

        System.out.print("Enter age of B: ");
        int ageB = scanner.nextInt();

        if (ageA > 0 && ageA <= 110 && ageB > 0 && ageB <= 110) {
            if (ageA > ageB) {
                System.out.println("B is younger.");
            } else if (ageA < ageB) {
                System.out.println("A is younger.");
            } else {
                System.out.println("A and B are of the same age.");
            }
        } else {
            System.out.println("Invalid age input. Ages must be positive and less than or equal to 110.");
        }
    }
}
