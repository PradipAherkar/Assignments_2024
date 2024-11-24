
import java.util.Scanner;

public class Assignment_16 {


    //Convert a temperature from Celsius to Fahrenheit using double
    static void task1(){
        Scanner s=new Scanner(System.in);

        System.out.printf("Type Temperature in Celcius : ");
                double celsius =s.nextFloat(); // Temperature in Celsius
                double fahrenheit = (celsius * 9 / 5) + 32; // Conversion formula
                System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
            }


    //Implement a truth table for logical operators (&&, ||, !).

    static void task2(){
                boolean[] values = {true, false};
        
                System.out.println("A\tB\tA && B\tA || B\t!A");
                System.out.println("--------------------------------------");
                for (boolean a : values) {
                    for (boolean b : values) {
                        System.out.printf("%b\t%b\t%b\t%b\t%b%n", a, b, a && b, a || b, !a);
                    }
                }
            }
public static void main(String[] args) {
    task1();
    task2();

}    
}