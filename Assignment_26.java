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
    
    static void task2(){
        Scanner n = new Scanner(System.in);

        // Program to suggest clothing based on weather conditions

        System.out.println("Enter temperature (in °C):");
        int temperature = n.nextInt();

        System.out.println("Is it windy? (true/false):");
        boolean windy = n.nextBoolean();

        System.out.println("Is it raining? (true/false):");
        boolean raining = n.nextBoolean();

        // Suggest clothing
        if (temperature < 10 && windy) {
            System.out.println("Wear a heavy jacket.");
        } else if (temperature >= 10 && temperature <= 20 && raining) {
            System.out.println("Wear a raincoat.");
        } else if (temperature > 20) {
            System.out.println("Wear light clothing.");
        } else {
            System.out.println("Dress comfortably.");
        }

    }

    public static void main(String[] args) {
        task1();
        task2();
    }
}