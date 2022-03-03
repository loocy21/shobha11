package Interview;

public class RecursionNumber 
{
	static void test (int a)
	{
		if(a>=1)
		{
			System.out.println(a);
			a--;
			test(a);
		}
	}

	public static void main(String[] args) 
	{
		test(10);

	}

}
