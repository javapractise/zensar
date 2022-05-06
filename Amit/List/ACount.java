import java.util.*;

class ACount{
	public static void main(String[] arhs)
	{
		List<String> l1 = Arrays.asList("Anthony", "John", "Mike","David", "andrew", "Mark", "Tony");
		int count = 0;
		for(String str : l1)
		{
			if(str.charAt(0) == 'a' || str.charAt(0) == 'A') {	count++;	}
		}
		System.out.println("Count of String who starts with 'A' are : "+count);
	
	}
}