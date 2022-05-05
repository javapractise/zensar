//getID() method
package javaprogram;

import java.util.*;
public class TimeZoneDemo1 {
public static void main(String args[])
{

// Creating a TimeZone
TimeZone offtime_zone
= TimeZone.getTimeZone("Pacific/Pago_Pago");

System.out.println("The ID is: "
+ offtime_zone.getID());
}
}