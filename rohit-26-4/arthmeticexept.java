

public class arthmeticexept {
	public static void main(String[] args)
	{
		int s = 0;
		int i=12;
		try {
			if(i/s!=0)
			{
				System.out.println("Is divisible");
			}
			else
				System.out.println("Not divisible");
		}
		catch(ArithmeticException e)
		{
			System.out.println("divident is zero 'arithmetic exception arised'");
		}
	}

}
