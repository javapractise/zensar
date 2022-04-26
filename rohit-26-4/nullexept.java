

public class nullexept {
	public static void main(String[] args)
	{
		String s = null;
		try {
			if(s.equals("rohit"))
			{
				System.out.println("Both string are same");
			}
			else
				System.out.println("Both are not same");
		}
		catch(NullPointerException e)
		{
			System.out.println("value is null");
		}
	}
}
