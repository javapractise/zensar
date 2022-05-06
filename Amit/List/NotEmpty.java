import java.util.*;

class NotEmpty{
	public static void main(String[] arhs)
	{
		List<String> l1 = Arrays.asList("Anthony", "", "John", "", "Mike","David", "", "andrew", "Mark", "Tony");
		System.out.println("Before removing the empty strings : \n"+l1);
		List<String> collect = new ArrayList<String>();
		for(String str : l1)
		{
			if(!str.isEmpty()){	collect.add(str);	}
		}	
		System.out.println("After removing the empty string from the list : \n"+collect);
		
	
	}
}