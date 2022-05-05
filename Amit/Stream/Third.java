import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Third
{
	public static void main(String[] args)
	{
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(11);
		arr.add(12);
		arr.add(10);
		arr.add(14);
		arr.add(15);
		arr.add(12);
		System.out.println("Given List : ");
		System.out.println(arr);
		System.out.println("Duplicate Elements : ");
		Set<Integer> set = new HashSet<Integer>();
            		arr.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		
	}
}