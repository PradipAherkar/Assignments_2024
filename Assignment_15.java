
// Perform bitwise operations

import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Any Two Numbers");
                int a =s.nextInt();
                int b =s.nextInt();
                
                // Perform Bitwise Operations and Display Results
                System.out.println("a = " + a + ", b = " + b);
                System.out.println("Bitwise AND (a & b): " + (a & b)); // Bitwise AND
                System.out.println("Bitwise OR (a | b): " + (a | b)); // Bitwise OR
                System.out.println("Bitwise XOR (a ^ b): " + (a ^ b)); // Bitwise XOR
                System.out.println("Bitwise NOT (~a): " + (~a)); // Bitwise NOT
                System.out.println("Left Shift (a << 1): " + (a << 1)); // Left shift
                System.out.println("Right Shift (a >> 1): " + (a >> 1)); // Right shift
    }   
}