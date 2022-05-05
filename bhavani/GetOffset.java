import java.util.*;
public class GetOffset
{
public static void main(String[]args)
{
SimpleTimeZone obj=new SimpleTimeZone(600,"India");
int off =obj.getOffset(Calendar.ZONE_OFFSET);
System.out.println("offset="+off);
}
}