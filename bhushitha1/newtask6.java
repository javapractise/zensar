package Inheritance;
import java.util.ArrayList;
import java.util.List;
public class Thursday {

	
	    public static void main(String args[]){
	        List<String> list = new ArrayList<>();
		list.add("");
		list.add("maya");
		list.add("bindu");
		list.add("maya");
		list.add("harika");
		list.add("devika");
		System.out.println("Before Join Comma");
		System.out.println(list);
		String s  =String.join(",", list);
		System.out.println(s);
	    }
	}