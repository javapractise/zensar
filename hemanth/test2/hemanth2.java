package practice;


import java.util.Arrays;
import java.util.List;
public class Thursday {

public static void main(String args[]){
List<String> list = new ArrayList<>();
list.add("");
list.add("hemanth");
list.add("naveen");
list.add("harsha");
list.add("hari");
list.add("uday");
long n = list.stream().filter(e ->e.length() > 3).count();
System.out.println(n);
}
}