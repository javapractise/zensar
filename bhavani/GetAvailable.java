import java.util.*;
public class GetAvailable
{
public static void main(String[]args)
{
String[] Id_array=TimeZone.getAvailableIDs();
System.out.println("all the available ids are:");
for(int count=0;count <Id_array.length;count++)
System.out.println(Id_array[count]);
}
}