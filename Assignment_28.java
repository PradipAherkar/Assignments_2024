import java.util.Scanner;

public class Assignment_28 {

    static void task1(){
         // Simple calculator supporting basic arithmetic with input validation

         Scanner s = new Scanner(System.in);
         
         System.out.print("Enter first number: ");
         double num1 = s.nextDouble();
         
         System.out.print("Enter an operator (+, -, *, /): ");
         char operator = s.next().charAt(0);
         
         System.out.print("Enter second number: ");
         double num2 = s.nextDouble();
         
         // Validate division by zero
         if (operator == '/' && num2 == 0) {
             System.out.println("Error: Division by zero is not allowed.");
             return;
            }
 
         double result;
         switch (operator) {
             case '+' -> result = num1 + num2;
             case '-' -> result = num1 - num2;
             case '*' -> result = num1 * num2;
             case '/' -> result = num1 / num2;
             default -> {
                 System.out.println("Error: Invalid operator.");
                 return;
                }
            }
            
            System.out.println("Result: " + result);           
        }
        
        // Function to check if a number is prime
        private static boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        static void task2(){
            // Program to find all prime numbers in a given range

            System.out.println("Enter the range from which you want prime numbers : ");

            Scanner s = new Scanner(System.in);

            int start = s.nextInt(), end = s.nextInt();

            System.out.println("Prime numbers between " + start + " and " + end + ":");

            for (int num = start; num <= end; num++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }
    
    public static void main(String[] args) {
        // task1();
        task2();
    }
}