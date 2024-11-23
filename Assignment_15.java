
// Perform bitwise operations

import java.util.Scanner;

public class Assignment_15 {
    // Task 1  Perform Bitwise Operations and Display Results
    static void task1(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Two Numbers");
        int a =s.nextInt();
        int b =s.nextInt();
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Bitwise AND (a & b): " + (a & b)); // Bitwise AND
        System.out.println("Bitwise OR (a | b): " + (a | b)); // Bitwise OR
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b)); // Bitwise XOR
        System.out.println("Bitwise NOT (~a): " + (~a)); // Bitwise NOT
        System.out.println("Left Shift (a << 1): " + (a << 1)); // Left shift
        System.out.println("Right Shift (a >> 1): " + (a >> 1)); // Right shift
    }
    
    // Task 2 Implement number swapping using XOR without a temporary variable.
        static void task2(){
            System.out.println("Enter ANy Two Number To Swap");
            Scanner s=new Scanner(System.in);
            int a =s.nextInt();
            int b =s.nextInt();
        
                System.out.println("Numbers are : a = " + a + ", b = " + b);
        
                // Swapping using XOR
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
        
                System.out.println("After swapping numbers are : a = " + a + ", b = " + b);
            }
    public static void main(String[] args) {
        task1();
        task2();
    }   
}