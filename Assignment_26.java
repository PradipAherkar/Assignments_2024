import java.util.Scanner;

public class Assignment_26 {

    static void task1(){
        // Program to determine a student's grade based on marks
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the student's marks (0-100):");
        int marks = n.nextInt();

        // Determine grade
        if (marks > 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Grade: B");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("Grade: C");
        } else if (marks >= 0 && marks <= 70) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        task1();
    }
}