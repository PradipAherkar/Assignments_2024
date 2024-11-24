
import java.util.Scanner;

public class Assignment_17 {
    public static void main(String[] args) {

        // Reverse a string without using built-in functions

        Scanner s=new Scanner(System.in);

        System.out.println("Enter The String : ");
        String original =s.next();
                char[] charArray = original.toCharArray();
                String reversed = "";
        
                for (int i = charArray.length - 1; i >= 0; i--) {
                    reversed += charArray[i];
                }
        
                System.out.println("Original String: " + original);
                System.out.println("Reversed String: " + reversed);       
                
      // Count the number of vowels, consonants, digits, and spaces in a string

            String str = "Java Programming 101!";
            int vowels = 0, consonants = 0, digits = 0, spaces = 0;
    
            for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)) {
                    digits++;
                } else if (Character.isLetter(ch)) {
                    if ("AEIOUaeiou".indexOf(ch) != -1) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (Character.isWhitespace(ch)) {
                    spaces++;
                }
            }
    
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);

    }
}
