package Inheritance;
import java.util.*;

public class Thursday {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
	list.add("sravan");
	list.add("sriya");
	list.add("ananya");
	list.add("anjana");
	list.add("aliya");
	long s=list.stream().count();
	System.out.println(s);
    }
}