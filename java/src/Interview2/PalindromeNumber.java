package Interview2;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		int num = 121;
		int temp = num;
		int rev = 0,rem;
		while(temp!=0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(rev==num)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome number");
		}

	}

}
