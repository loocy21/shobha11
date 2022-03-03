package Pankaj;

public class Whatsapp {
	static String appname = "whatsapp";
	long contactnumber = 7060780642L;
	static String ceo = "mark jukarberg";
	int noOfMassageSent;
	void messageContent(String data)
	{
		System.out.println("send message +"+data);
	}
	static void logoCreation()
	{
		System.out.println("logo....");
	}
	class User
	{
		void eat()
		{
			System.out.println("eat on time");
		}
	}

	public static void main(String[] args) 
	{
		//create object for static variable
		System.out.println("appname="+appname);
		//create object for non static variable
		Whatsapp wp = new Whatsapp();
		System.out.println(wp.contactnumber);
		//static variable
		System.out.println("ceo="+ceo);
		//variable without argument 
		System.out.println("Whatsapp ="+new Whatsapp().noOfMassageSent);
		//non static method 
		Whatsapp Wp = new Whatsapp();
		wp.messageContent("text");
		//static method call by method name
		logoCreation();
		//call a non static method by create new object
		//when u have two class
		Whatsapp.User ws = wp.new User();
		ws.eat();
	}

}
