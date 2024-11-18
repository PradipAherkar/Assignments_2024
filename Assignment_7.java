
// Palindrome checker logic

import java.util.Scanner;

public class Assignment_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a string: ");
 
        String str = scanner.nextLine();

        String reversed = "";
 
        for (int i = str.length()-1; i >=0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}