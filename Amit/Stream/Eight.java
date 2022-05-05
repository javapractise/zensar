import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Eight
{
	public static void main(String[] args)
	{
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(15);
		arr.add(11);
		arr.add(13);
		arr.add(13);
		arr.add(12);
		arr.add(10);
		System.out.println("Given List : ");
		System.out.println(arr);
		System.out.println("Sorted list : ");
		arr.stream().sorted().forEach(System.out::println);
		
	}
}