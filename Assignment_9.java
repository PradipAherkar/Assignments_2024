
// Program to check if a character is a vowel or consonant and count it

import java.util.Scanner;
public class Assignment_9 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                // Taking user input for a string
                System.out.print("Enter a string: ");
                String input = scanner.nextLine().toLowerCase();
        
                // Initializing counters for vowels and consonants
                int vowelCount = 0;
                int consonantCount = 0;
        
                // Iterating through each character in the string
                for (char character : input.toCharArray()) {
                    if (Character.isLetter(character)) {
                        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    }
                }
        
                // Displaying results
                System.out.println("Number of vowels: " + vowelCount);
                System.out.println("Number of consonants: " + consonantCount);
        
                scanner.close(); // Closing the scanner
            }
        }
        