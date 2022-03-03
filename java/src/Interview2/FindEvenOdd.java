package Interview2;

import java.util.Scanner;

public class FindEvenOdd {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in); int num = sc.nextInt();
		  System.out.println("Enter the number");
		 
		 
		if (num % 2 == 0) {
			System.out.println("this is even number");
		} else {
			System.out.println("this is odd number");
		}

	}

}
