import java.util.ArrayList;
import java.util.Comparator;

public class FailFast {

	public static void main(String[] args) {
		ArrayList<String > list =new ArrayList<>();
		list.add("Somya");
		list.add("Ram");
		list.add("Tanya");
		
		//Iterator<String>  itr =list.iterator();
		for(String s :list)
		{
			System.out.println(s);
		list.add("addd other");
			
		}
		
	}

}