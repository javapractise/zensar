import java.util.*;

public class GetIDOfTimeZone 
{
    public static void main(String args[])
	{
        
        TimeZone tz = TimeZone.getTimeZone("austrila/America");
        System.out.print("tz.getID(): ");
        System.out.println(tz.getID());
    }
}
//
C:\Users\SC67784\repo\SAMPLE>javac GetIDOfTimeZone.java

C:\Users\SC67784\repo\SAMPLE>java GetIDOfTimeZone.java
tz.getID(): GMT