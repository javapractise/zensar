import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Second
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
		arr.add(30);
		System.out.println("Given List : ");
		System.out.println(arr);
		System.out.println("Numbers starting from 1 : ");
		arr.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
		
	}
}