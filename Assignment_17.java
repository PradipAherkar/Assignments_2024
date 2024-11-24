
import java.util.Scanner;

public class Assignment_17 {
    public static void main(String[] args) {
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
    }
}
