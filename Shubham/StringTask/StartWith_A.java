import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StartWith_A {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("");
		list.add("Shivam");
		list.add("Raju");
		list.add("raj");
		list.add("aanchal");
		list.add("arpit");
		long i =list.stream().filter(e -> e.startsWith("a")).count();

		System.out.println(i);
	}
	

}