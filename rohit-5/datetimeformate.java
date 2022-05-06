import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Locale;  
public class datetimeformate {  
	public static void main(String[] args) {  
		Date date = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
		String strDate = formatter.format(date);  
		System.out.println("Format MM/dd/yyyy : "+strDate);  
		System.out.println("----------------------------------"); 

		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
		strDate = formatter.format(date);  
		System.out.println("Format dd-M-yyyy hh:mm:ss : "+strDate);

		System.out.println("----------------------------------"); 

		formatter = new SimpleDateFormat("dd MMMM yyyy");  
		strDate = formatter.format(date);  
		System.out.println("Format dd MMMM yyyy : "+strDate);  

		System.out.println("----------------------------------"); 

		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
		strDate = formatter.format(date);  
		System.out.println("Format dd MMMM yyyy zzzz : "+strDate);  

		System.out.println("----------------------------------"); 

		formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
		strDate = formatter.format(date);  
		System.out.println("Format E, dd MMM yyyy HH:mm:ss z : "+strDate); 

		System.out.println("----------------------------------");  
	}  
} 