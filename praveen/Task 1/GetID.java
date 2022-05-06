import java.util.*;

class GetID{
	public static void main(String args[])
	{
	    
		// Creating a TimeZone
		TimeZone tm = TimeZone.getTimeZone("US");

		// Knowing the DST
		System.out.println("The ID is: "+ tm.getID());
		
		// Creating a TimeZone
		TimeZone tm2 = TimeZone.getTimeZone("Indian/Maldives");

		// Knowing the DST
		System.out.println("The Special ID is: "+ tm2.getID());
	}
}