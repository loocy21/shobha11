package Interview;

public class Test1 {

	public static void main(String[] args)
	
	{
		int enterpin = 1234;
		int storepin = 1234;
		if(enterpin == storepin)
		{
			int amt = 15000;
			int balance = 10000;
			if(amt<=balance)
			{
				System.out.println("withdrawal Succesful");
			}
			else
			{
				System.out.println("insufficient funds");
			}
		}
			else 
			{
				System.out.println("wrong pin");
			}
		}
	}

