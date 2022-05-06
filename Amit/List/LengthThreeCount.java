import java.util.*;

class LengthThreeCount{
	public static void main(String[] arhs)
	{
		List<String> l1 = Arrays.asList("Dog", "Cat", "Lion","Tiger", "Elephant", "Deer", "Zebra");
		int count = 0;
		for(String str : l1)
		{
			if(str.length() == 3){	count++;	}
		}
		System.out.println("Count of String whose length is 3 are : "+count);
	
	}
}