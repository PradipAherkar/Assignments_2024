
public class Assignment_18 {

    static void task1(){
        // 1. Find the maximum, minimum, and average of an array of integers
                int[] numbers = {10, 20, 30, 40, 50};
                int max = numbers[0], min = numbers[0];
                double sum = 0;
        
                for (int num : numbers) {
                    if (num > max) max = num;
                    if (num < min) min = num;
                    sum += num;
                }
        
                double average = sum / numbers.length;
        
                System.out.println("Maximum: " + max);
                System.out.println("Minimum: " + min);
                System.out.println("Average: " + average);        
    }

    public static void main(String[] args) {
        task1();
    }
}
