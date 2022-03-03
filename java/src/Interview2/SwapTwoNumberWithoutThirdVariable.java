package Interview2;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args)
	{
			int a,b;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number");
			a= sc.nextInt();
			System.out.println("Enter second number");
			b= sc.nextInt();
			
			a= a+b;
			b=a-b;
			a=a-b;
			
			System.out.println(a);
			System.out.println(b);
			


	}

}
