package Inheritance;
import java.util.Arrays;
import java.util.List;
public class Thursday {
	
	  public static void main(String args[]){
	        List<String> list = new ArrayList<>();
		list.add("");
		list.add("divya");
		list.add("riya");
		list.add("priya");
		list.add("harsha");
		list.add("aswini");
		long s = list.stream().filter(e ->e.length() > 3).count();
		System.out.println(s);
	    }
	}
	
	