import java.util.*;
  
public class Count6 {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
	list.add("");
	list.add("Shiva");
	list.add("Anu");
	list.add("anu");
	list.add("archana");
	list.add("akhila");
	System.out.println("Before Join Comma");
	System.out.println(list);
	String s  =String.join(",", list);
	System.out.println(s);
    }
}