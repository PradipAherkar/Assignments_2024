public class Assignment_27{

static void task1(){
             // Program to count the number of 1 bits in an integer using bitwise operations
             int num = 29;  // Binary: 11101
             int count = 0;
     
             // Count 1 bits using bitwise AND
             while (num != 0) {
                 count += (num & 1);
                 num >>= 1; // Right shift
             }
     
             System.out.println("Number of 1 bits: " + count);
}

    public static void main(String[] args) {
        task1();
    }
}