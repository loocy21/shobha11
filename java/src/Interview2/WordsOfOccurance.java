package Interview2;

public class WordsOfOccurance {

	public static void main(String[] args) 
	{
		String s = "java is java again java again";
		char c= 'a';
		
		int count = s.length() - s.replace("a", "").length();
		System.out.println("a:"+count);

	}

}
