import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RemoveEmplyString {
	public static void main(String[] args) {
		
		List<String> locations = new ArrayList<>(Arrays.asList("", "Chennai", "", "goa", "gokarna", ""));
		System.out.println("Before: "+ locations);
		
		locations.removeIf(String::isEmpty);
		
		System.out.println("After: "+ locations);
	}

}