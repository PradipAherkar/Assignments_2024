import java.util.Scanner;

public class Assignment_3 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Gross Salary :\n");
		Float Gsalary=s.nextFloat();        // Gsalary --> Gross Salary
		
		if(Gsalary>=0)
			{
				if(Gsalary>=0 && Gsalary<=250000) {
					System.out.println("Pay Tax Amount of : "+Gsalary*0);
				}
				else if(Gsalary>250000 && Gsalary<=500000) {
					System.out.println("Your Tax Amount : "+(Gsalary)*0.05);
				}
				else if(Gsalary>500000 && Gsalary<=1000000) {
					System.out.println("Your Tax Amount : "+(12500+(Gsalary-500000)*0.2));
				}
				else if(Gsalary>1000000) {
					System.out.println("Your Tax Amount : "+(112500+(Gsalary-1000000)*0.30));
				}
			}
		else
		{
			System.out.println("\nEnter Correct Gross Salary Amount.\nIt should not be negative!");
			}
	}
}


