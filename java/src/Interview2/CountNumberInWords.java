package Interview2;

public class CountNumberInWords {

	public static void main(String[] args) 
	{
		String s = "hello hello i am there";
		int count = 1;
		for(int i=0; i<s.length()-1; i++)
		{
			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		
		System.out.println(count);

	
	}

}
