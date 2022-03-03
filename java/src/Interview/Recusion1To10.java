package Interview;

public class Recusion1To10
{
	static void test1(int a)
	{
		if(a<=10)
		{
			System.out.println(a);
			a++;
			test1(a);
			
		}
	}

	public static void main(String[] args) 
	{
		test1(1);

	}

}
