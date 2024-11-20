
// Implicit and Explicit Type Casting Between Different Data Types

public class Assignment_10 {
        public static void main(String[] args) {
        // Implicit Type Casting
        int intVal = 100;
        long longVal = intVal;
        double doubleVal = longVal;

        System.out.println("Implicit Type Casting:");
        System.out.println("int to long: " + longVal);
        System.out.println("long to double: " + doubleVal);

        // Explicit Type Casting
        double doubleValue = 99.99;
        long longValue = (long) doubleValue;
        int intValue = (int) longValue;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("double to long: " + longValue);
        System.out.println("long to int: " + intValue);
    }
}