package Interview2;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int num = 153;
		int temp = num;
		int arm =0;
		int a;
		while(num>0)
		{
			a = num%10;
			num = num/10;
			arm = arm+a*a*a;
		}
		if(arm==temp)
		{
			System.out.println("this is armstromg");
		}
		else
		{
			System.out.println("this is not armstrong");
		}
	}

	}

