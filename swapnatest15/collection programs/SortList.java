import java.util.*;  
import java.util.stream.*;  
public class SortList  
{  
	public static void main(String[] args)   
	{  
 
	List<String> slist = Arrays.asList("swapna", "gopi krishna", "teja", "prudhvi", "hema", "billu");  
	List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());     
	sortedList.forEach(System.out::println);  
	}  
} 
//
C:\Users\SC67784\repo\SAMPLE>javac SortList.java

C:\Users\SC67784\repo\SAMPLE>java SortList.java
billu
gopi krishna
hema
prudhvi
swapna
teja