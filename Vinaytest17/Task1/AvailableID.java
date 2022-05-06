import java.util.*;

class AvailableID{
	public static void main(String[] args)
	{
		String[] arr = TimeZone.getAvailableIDs();
		System.out.println("Available ID's are :");
		for(int i=0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
}