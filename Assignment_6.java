
import java.util.Arrays;



//Array Reversal using for loop

public class Assignment_6 {

    static void Reversal(){
               int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Previous array: " + Arrays.toString(arr));

        // Using a loop to swap elements
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
 
    public static void main(String[] args) {
        Reversal();
    }

}