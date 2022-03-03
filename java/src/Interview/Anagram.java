package Interview;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String x = "Welcome";
		String y = "emoclew";
		
		char [] a = x.toCharArray();
		char [] b = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean resp = Arrays.equals(a, b);
		
		if(resp==true)
		{
			System.out.println("this is anagram");
		}
		else
		{
			System.out.println("this is not anagram");
		}
				
				

	}

}
