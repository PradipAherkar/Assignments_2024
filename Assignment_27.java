
import java.util.Scanner;

public class Assignment_27{

        static void task1(){
             // Program to count the number of 1 bits in an integer using bitwise operations
             System.out.println("Enter any number to check 1 bits in it.");
             Scanner s=new Scanner(System.in);
             int num = s.nextInt();  // Binary: 11101
             int count = 0;
             
             // Count 1 bits using bitwise AND
             while (num != 0) {
                 count += (num & 1);
                 num >>= 1; // Right shift
            }
                
            System.out.println("Number of 1 bits: " + count);
        }
            
        static void task2(){
             // Program to check if a number is even or odd using the bitwise AND operator
             System.out.println("Enter any number to check even or odd.");
             Scanner s=new Scanner(System.in);
             int num = s.nextInt();
             
             // Check if the number is even or odd using bitwise AND
             if ((num & 1) == 0) {
                 System.out.println(num + " is even.");
                } else {
                    System.out.println(num + " is odd.");
                }
            }
            
        static void task3(){
            // Program to check if a number is a power of 2 using bitwise ANDint num = 16;
                
            System.out.println("Enter any number to check it is power of 2 or not.");
            Scanner s=new Scanner(System.in);
            int num = s.nextInt();

            // Check if the number is a power of 2 using bitwise AND

            if (num > 0 && (num & (num - 1)) == 0) {
                System.out.println(num + " is a power of 2.");
            } else {
                System.out.println(num + " is not a power of 2.");
            }
        }
            
        public static void main(String[] args) {
            task1();
            task2();
            task3();
    }
}