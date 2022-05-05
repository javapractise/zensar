import java.util.*;

public class GetAvailableIDsOfTimeZone 
{
    public static void main(String args[]) 
	{
        TimeZone tz = TimeZone.getDefault();
        System.out.println("tz: " + tz);

        System.out.println();
        String[] avail_id = tz.getAvailableIDs();
        System.out.println("tz.getAvailableIDs(): ");
        for (String s: avail_id)
            System.out.println(s);
        avail_id = tz.getAvailableIDs(3600);

        
        System.out.println("tz.getAvailableIDs(offset): ");
        for (String st: avail_id)
            System.out.println(st);
    }
}
//
tz.getAvailableIDs():
Africa/Abidjan
Africa/Accra
Africa/Addis_Ababa
Africa/Algiers
Africa/Asmara
Africa/Asmera
Africa/Bamako
Africa/Bangui
Africa/Banjul
Africa/Bissau
