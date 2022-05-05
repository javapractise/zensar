//getAvailableID()
package javaprogram;


import java.util.*;

public class TimeZoneDemo2 {
public static void main(String args[])
{

// Storing all the available Ids
String[] Id_array
= TimeZone.getAvailableIDs();
System.out.println("All the available Ids are: ");
for (int count = 0;
count < Id_array.length; count++)
System.out.println(Id_array[count]);
}
}