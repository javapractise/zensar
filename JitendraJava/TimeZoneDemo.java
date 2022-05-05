// getOffset() method

package javaprogram;


import java.util.*;



public class TimeZoneDemo {
public static void main(String args[])
{



// Creating a TimeZone
TimeZone offtime_zone
= TimeZone.getTimeZone("Europe/Rome");



// Checking the offset for the systems date
System.out.println("The Offset Value is:"
+ offtime_zone
.getOffset(Calendar.ZONE_OFFSET));
}
}