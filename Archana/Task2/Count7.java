import java.util.*;
  
public class Count7 {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
	//list.add("");
	list.add("Shiva");
	list.add("Anu");
	list.add("anusha");
	list.add("archana");
	list.add("akhila");
	long s=list.stream().count();
	System.out.println(s);
    }
}