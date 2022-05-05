import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Four
{
	public static void main(String[] args)
	{
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(11);
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		System.out.println("Given List : ");
		System.out.println(arr);
		System.out.println("First Number from given List : ");
		Optional<Integer> ans = arr.stream().findFirst();
		if(ans.isPresent()){		System.out.println(ans.get());		}
		else{	System.out.println("No value in the list");	}
		
	}
}