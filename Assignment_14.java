
//Evaluate expressions with operator precedence and parentheses. 

import java.util.Scanner;

public class Assignment_14{

    static void method1(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 Numbers : ");
        int a =s.nextInt(), b = s.nextInt(), c =s.nextInt();
        
        System.out.println("Choose Any Option");
        System.out.println("Expression 1 (a + b * c)");
        System.out.println("Expression 2 ((a + b) * c)");
        System.out.println("Expression 3 (a * (b - c) / c)");
        System.out.println("4 Exit This Program");
        
        int n=s.nextInt();
        
        // Evaluate using operators and parentheses
        int result1 = a + b * c;          // Without parentheses
        int result2 = (a + b) * c;        // With parentheses
        int result3 = a * (b - c) / c;    // Mixed operations with parentheses
        
        // Display results
        switch (n) {
            case 1:
            System.out.println("Expression 1 (a + b * c): " + result1);
            method1();
                break;
            case 2:
            System.out.println("Expression 2 ((a + b) * c): " + result2);
            method1();
                break;
            case 3:
            System.out.println("Expression 3 (a * (b - c) / c): " + result3);
            method1();
                break;
            case 4:
            System.out.println("Exited Program");
            break;
            default:
            System.out.println("Choose Atleast one.");
            method1();
            }

    }

    public static void main(String[] args) {
        method1();
    }
}