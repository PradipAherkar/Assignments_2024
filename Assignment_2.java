import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		//Factorial Of Positive Number Logic
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Number ");
				int a=scan.nextInt();
		
		if(a>=0) {
			if (a==0) {
			System.out.println("Number is Zero.");
			System.out.println("Factorial is 1.");
				
			}else{
			System.out.println("Number is a Positive.");

			int fact=1;
			for(int i=1;i<=a;++i) {
				fact=fact*i;
			}
				System.out.println("Factorial is "+fact);
			}
		}
		else
			System.out.println("Number is negative. Negative number cant have factorial.");
	}
}