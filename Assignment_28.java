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
    
    public static void main(String[] args) {
        task1();
    }
}