package Pankaj;

public class Test10 {

		public static void main(String[] args) {
			String  s="good noon madam";
			s.trim();
			String[] str = s.split(" ");
			for(int i=0;i<str.length;i++)
			{
				System.out.println(str[i]);
				for(int j=0;j<str[i].length();j++)
				{
					int count=0;
					for(int k=0;k<str[i].length();k++) 
					{
						if(str[i].charAt(j)==str[i].charAt(k) && j>k) 
						{
							break;
						}
						if(str[i].charAt(j)==str[i].charAt(k))
						{
							count++;
						}
					}
					if(count>1) {
						System.out.println(str[i].charAt(j) + " count is " + count);
					}
				}
			}


	}

}
