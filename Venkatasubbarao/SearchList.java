
import java.util.*;

public class SearchList{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched in array list :");
		int num = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		int index = a.indexOf(num);

		if(index == -1)
		{
			System.out.println("Element is not in the Array list");
		}
		else
		{
			System.out.println("Element is found at location "+index);
		}

	}
} 