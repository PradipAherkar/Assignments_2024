//for loop and basic examples

import java.util.Scanner;


public class Assignment_4{



	//print 1 to 10
	static void ex1() {
		System.out.println("Print 1 to 10 ");
        for(int i=1;i<=10;++i) {
					System.out.println(i);
		}
		System.out.println("\n\n");
	}
	
	//print 44 to 22
	static void ex2() {
        System.out.println("Print 44 to 22 ");
		for(int i=44;i>=22;i-=2) {
				System.out.println(i);	
		}
		System.out.println("\n\n");
	}
	
	//even in 15 to 35
	static void ex3() {
        System.out.println("Even numbers 15 to 35 ");
		for(int i=15;i<=35;++i) {
			if(i%2==0)
				System.out.println(i);	
		}
		System.out.println("\n\n");
	}
	
	//odd in 66 to 44
	static void ex4() {
            System.out.println("Odd numbers 66 to 44 ");
			for(int i=66;i>=44;--i) {
				if(i%2!=0)
					System.out.println(i);	
			}
			System.out.println("\n\n");
		}
		
	//sum of first 10
	static void ex5() {
        System.out.println("Sum of 1 to 10 ");
		int sum=0;		
		for(int i=1;i<=10;++i) {
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("Sum of numbers is : "+sum+"\n\n");
	}
	
	//sum of even numbers 15 to 35
	static void ex6() {
        System.out.println("Sum of even numbers 15 to 35 ");
		int sum=0;
		for(int i=15;i<=35;++i) {
			if(i%2==0)
				System.out.println(i);
				sum=sum+i;
		}
		System.out.println("Sum of numbers is : "+sum+"\n\n");
	}
	
	//sum of odd numbers 15 to 35
	static void ex7() {
        System.out.println("Sum of odd in 15 to 35 ");
		int sum=0;
		for(int i=15;i<=35;++i) {
			if(i%2!=0)
				System.out.println(i);
	            sum=sum+i;
		}
		System.out.println("Sum of numbers is : "+sum+"\n\n");
	}

	//numbers divisible by 7 in 1 to 100
	static void ex8() {
        System.out.println("Sum of even numbers divisible by 7 in 1 to 100 ");
		for(int i=1;i<=100;++i) {
			if(i%7==0)
				System.out.println(i);
		}
		System.out.println("\n\n");
	}
	
	
	//sum of even numbers divisible by 3 and 5 in 1 to 100
	static void ex9() {
            System.out.println("Sum of even numbers divisible by 3 and 5 in 1 to 100 ");
			int sum=0;
			for(int i=15;i<=35;++i) {
				if(i%3==0 || i%5==0)
					System.out.println(i);
					sum=sum+i;
			}
			System.out.println("Sum of numbers is : "+sum+"\n\n");
		}

		//Prime number
	static void ex10() {
	Scanner scanner = new Scanner(System.in);
	            System.out.println("Check for Prime number");
				      System.out.print("Enter a number: ");
	                    int number = scanner.nextInt();
	                    scanner.close();
	                    boolean isPrime = true;

	                    if (number <= 1) {
	                        isPrime = false;
	                    } else {
	                        for (int i = 2; i <= Math.sqrt(number); i++) {
	                            if (number % i == 0) {
	                                isPrime = false;
	                                break;
	                            }
	                        }
	                    }

	                    if (isPrime) {
	                        System.out.println(number + " is a prime number.");
	                    } else {
	                        System.out.println(number + " is not a prime number.");
	                    }
		}

	public static void main(String[] args) {
		
		ex1();
		ex2();
		ex3();
		ex4();
		ex5();
		ex6();
		ex7();
		ex8();
		ex9();
		ex10();
        

	}
}