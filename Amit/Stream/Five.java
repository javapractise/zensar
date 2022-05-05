import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Five
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
		
		Optional<Integer> ans = arr.stream().findFirst();
		long num = arr.stream().count();
		System.out.println("Count of elements present in List : "+num);
		
		
	}
}