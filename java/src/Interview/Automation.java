package Interview;

import java.util.LinkedHashSet;

public class Automation {

	public static void main(String[] args)
	{
		String s = "i am automation engineer";
		System.out.println(s);
		s=s.replace(" ","");
		
		String temp = "";
		
		LinkedHashSet<Character>set = new LinkedHashSet<Character>();
	for(int i=0; i<s.length(); i++)
	{
		set.add(s.charAt(i));
	}
	for (Character ch : set) 
	{
		int count = 0;
		
		
	
	for(int i=0; i<s.length(); i++)
	{
		if(ch==s.charAt(i))
		{
			count++;
		}
	}
	System.out.println(ch+" "+count);
	if(count>=0)
	{
		temp = temp + ch;
		
	}

	}
	System.out.println(temp);

}
}
