package practice;


import java.util.ArrayList;
import java.util.List;
public class Thursday {




public static void main(String args[]){
List<String> list = new ArrayList<>();
list.add("");
list.add("india");
list.add("is");
list.add("my ");
list.add("counntry");
System.out.println("Before Join Comma");
System.out.println(list);
String n =String.join(",", list);
System.out.println(n);
}
}