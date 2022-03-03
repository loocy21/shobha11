package Interview;

public class palindrome {

	public static void main(String[] args) {
		int num = 145452;
		int temp = num;
		int rev = 0,rem;
		while(temp!=0)
		{
		 rem = temp%10;
		rev = rev*10+rem;
		temp = temp/10;
		}
		if(num==rev)
		{
		System.out.println("this is palindrome");
		}
		else
		{
		System.out.println("this is not palindrome");
		}
		}
		}
	