import java.util.*;

public class RetrieveList{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index number from which you want to retrieve the element (0-3):");
		int index = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		System.out.println("Element at location "+index+" is : "+a.get(index) );
		
	}
}