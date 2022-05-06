package practice;

import java.util.*;
import java.util.List;
public class Thursday {
public static void main(String[] args)
{
List<String> Name = new ArrayList<>();
Name.add("ananya");
Name.add("adi");
Name.add("hemanth");
Name.add("bushitha");
Name.add("akshatha");
Name.add("surya");
Name.add("ravi");
Name.add("Ravi");

long count = Name
.stream()
.filter(Names -> Names.startsWith("A"))
.count();

System.out.println("count for Name "
+ "starting with alphabet 'A' = " + count);
}
}