import java.util.*;

class EmptyCount{
	public static void main(String[] arhs)
	{
		List<String> l1 = Arrays.asList("", "Cricket", "FootBall","", "Chess", "BasketBall", "");
		int count = 0;
		for(String str : l1)
		{
			if(str.isEmpty()){	count++;	}
		}
		System.out.println("Count of Empty String in List : "+count);
	
	}
}