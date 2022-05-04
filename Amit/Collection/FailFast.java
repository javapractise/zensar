import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class FailFast{
	public static void main(String[] args)
	{
		Map<Integer, String> emp = new HashMap<Integer, String>();
		emp.put(1, "John");
		emp.put(2, "Mike");
		emp.put(3, "David");

		Iterator itr = emp.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(emp.get(itr.next()));

			emp.put(4, "Brawis");
		}
	}
}