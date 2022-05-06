import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StringJoin {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("");
		list.add("Shivam");
		list.add("Raju");
		list.add("raj");
		list.add("aanchal");
		list.add("arpit");
		System.out.println("Before Join Comma");
		System.out.println(list);
String string  =String.join(",", list);
System.out.println(string);
	}

}