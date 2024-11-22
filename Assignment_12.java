import java.util.Scanner;

// Simple Calculatot Perform Basic Operations : Addition Substraction Multiplication Division

public class Assignment_12 {
    
    static void Calc(){
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Any Number");
            int num1=s.nextInt();
            System.out.println("Enter Any Number");
            int num2=s.nextInt();
            
   
            System.out.println("Choose Operation");
            System.out.println("1. Addition");
            System.out.println("2. Substract 2nd from 1st");
            System.out.println("3. Multiply");
            System.out.println("4. Divide 1st by 2nd");
            int op=s.nextInt();
            System.err.println("Number 1 is : "+num1+"\nNumber 2 is : "+num2+"\nOutput Is : ");
            switch (op) {
                case 1 -> System.out.print(num1+num2);
                case 2 -> System.out.print(num1-num2);
                case 3 -> System.out.print(num1*num2);
                case 4 -> System.out.print(num1/num2);
                default -> {
                    System.out.println("Number 1 is : "+num1+"\nNumber 2 is : "+num2+"Invalid Input Choose Valid Operation");
                    Calc();
                }
            }
        }
        }
    public static void main(String[] args) {
        Calc();
        }
}