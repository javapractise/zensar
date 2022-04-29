
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class FailFast
{
public static void main(String args[])
{
Map<String,String> employee = new HashMap<String,String>();
employee.put("bhavani","india");
employee.put("surya","india");
employee.put("jinde","india");
Iterator iterator=employee.keyset().iterator();
while(iterator.hasNext())
{
System.out.println(employee.get(iterator.next()));
employee.put("sai","turkey");
}
}
}


