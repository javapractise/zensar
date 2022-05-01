import java.util.*;
public class SearchList
{
  public static void main(String[] args)
  {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
    if (list_Strings.contains("blue")) 
	{
    System.out.println("Found the element");
    }
	else 
	{
    System.out.println("There is no such element");
    }
  }
}
//
C:\Users\SC67784\repo\SAMPLE>javac SearchList.java

C:\Users\SC67784\repo\SAMPLE>java SearchList.java
Found the element

C:\Users\SC67784\repo\SAMPLE>javac SearchList.java

C:\Users\SC67784\repo\SAMPLE>java SearchList.java
There is no such element
