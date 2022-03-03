package Interview;
import java.text.SimpleDateFormat;
public class Date {

	public static void main(String[] args) 
	{
	
	       
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH/MM/SS");  
	    
	     Date date = new Date();  
	    System.out.println(formatter.format(date));
	}

}
