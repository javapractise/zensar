import java.util.*;

public class GetOffsetOfTimeZone 
{
    public static void main(String args[])
	{
        
        TimeZone tz = TimeZone.getTimeZone("Africa/Asmera");
        System.out.println("tz: " + tz);
        System.out.print("tz.getOffset(era's, yy, mm,dd,dow,time): ");
        System.out.println(tz.getOffset(1, 2009, 3, 3, 3, 100));
        System.out.print("tz.getOffset(long d): ");
        System.out.println(tz.getOffset(Calendar.ZONE_OFFSET));
    }
}
//
C:\Users\SC67784\repo\SAMPLE>java GetOffsetOfTimeZone.java
tz: sun.util.calendar.ZoneInfo[id="Africa/Asmera",offset=10800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null]
tz.getOffset(era's, yy, mm,dd,dow,time): 10800000
tz.getOffset(long d): 10800000