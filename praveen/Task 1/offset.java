import java.util.*;
public class OffSet {
	public static void main(String args[])
	{    
		// Creating a TimeZone
		TimeZone tm = TimeZone.getTimeZone("Poland");
		// Knowing the DST
		System.out.println("The Offset Value for ID "+tm.getID()+" is:"+ tm.getOffset(Calendar.ZONE_OFFSET));
		
		// Creating a TimeZone
		TimeZone tm2 = TimeZone.getTimeZone("Indian/Maldives");

		// Knowing the DST
		System.out.println("The Offset Value for ID "+tm2.getID()+" is:"+ tm2.getOffset(Calendar.ZONE_OFFSET));
	}
}