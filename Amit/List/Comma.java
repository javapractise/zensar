import java.util.*;
  
public class Comma {
    	public static void main(String args[])
   	{
  		List<String>list = new ArrayList<>( );
		list.add("Apple");
		list.add("Kiwi");
		list.add("Grapes");
		list.add("Banana");

        		System.out.println("List of String: " + list);
		list.stream().map(fruit -> fruit.toUpperCase());
		String string = String.join(",", list);
		System.out.println("Updated String: "+ string);
    }
}