import java.util.*;
  
public class TimeZoneDemo {
    public static void main(String args[])
    {
  
        // Creating a TimeZone
        TimeZone t = TimeZone.getTimeZone("Asia/Kolkata");
  
        // Checking the offset for the systems date
        System.out.println("The Offset Value is:"+ t.getOffset(Calendar.ZONE_OFFSET));
	System.out.println("The ID is: " + t.getID());

	String[] id = TimeZone.getAvailableIDs();
      // printing available ids
      System.out.println("The available IDs are as follows:");
      for (int i = 0; i< id.length; i++) {
         System.out.println(id[i]);
      }
    }
}