package Interview2;

public class NumberOfDigitInGivenNumber {

	public static void main(String[] args) 
	{
		int num = 56784;
		int a = 0;
		if(num<0)
		{
		num = num * -1;
		}
		else if(num == 0)
		{
		num =1;
		}
		while(num>0)
		{
		num = num/10;
		a++;
		}
		System.out.println("number of digit:"+a);
		
	}

}
