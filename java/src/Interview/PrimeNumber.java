package Interview;

public class PrimeNumber {

	public static void main(String[] args) {
	int num = 7;
	int temp = 0;
	for(int i=2; i<=num/2; i++)
	{
		if(num%i==0)
		{
			temp++;
		}
	}
	if(temp==0)
	{
		System.out.println("this is prime");
	}
	else
	{
		System.out.println("this is not prime");
	}
	}

}
