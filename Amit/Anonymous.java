abstract class Fruits{
	abstract void taste();
}

class Anonymous{
	public static void main(String[] args)
	{
		Fruits f = new Fruits()
		{
			void taste()
			{
				System.out.println("Sweet Fruits");
			}
		};
		f.taste();
	}
}