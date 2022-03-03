package Pankaj;

	class Apartment
	{
		static String Apartname = "white house";
		int housenumber;
		static String city ="washington";
		String houseOwnerName;
		static 	boolean mainGate = true;
		static boolean park = true;
		static boolean lift = true;
		int houseRent;
		static boolean gym = true;
		static void genralMeeting()
		{
			
			System.out.println("meeting");
		}
	
		public static void main(String[] args) 
		{
			System.out.println("Apartname="+Apartname);
			System.out.println("housenumber="+new Apartment().housenumber);
			System.out.println("city="+city);
			System.out.println("mainGate="+mainGate);
			System.out.println("park="+park);
			System.out.println("lift="+lift);
			
			
			Apartment hr = new Apartment();
			System.out.println("houseRent="+hr.houseRent);
			
			System.out.println("gym="+gym);
			genralMeeting();
		
		
			
		}

		
			
		}
		
			
		
	
		
	
		
	
	
	
	
		


