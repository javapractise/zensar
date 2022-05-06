package Inheritance;
import java.util.*;
import java.util.List;
public class Thursday {
	 public static void main(String[] args)
	 {
       List<String> Name = new ArrayList<>();
	        Name.add("suraj");
	        Name.add("sai");
	        Name.add("hemanth");
	        Name.add("mouli");
	        Name.add("akshatha");
	        Name.add("surya");
	        Name.add("ravi");
	        Name.add("Ravi");
	        Name.add("Sunitha");
	        Name.add("teja");
	        Name.add("janaki");
	        long count = Name
	                .stream()
	                .filter(Names -> Names.startsWith("A"))
	                .count();
	 
	        System.out.println("count for Name "
	                + "starting with alphabet 'A' = " + count);
	    }
	}