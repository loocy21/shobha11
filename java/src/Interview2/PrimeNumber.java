package Interview2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int temp = 0;
		 for(int i=2; i<num; i++)
		 {
			 if(num%i==0)
			 {
				 temp++;
			 }
			 
		 }
		 if(temp==0)
		 {
			 System.out.println("this is prime number");
		 }
		 else
		 {
			 System.out.println("this is not prime number");
		 }

	}

}
