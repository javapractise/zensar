// Class implements interface

interface Games{
	public void watch();
}

class Competition implements Games{
	public void watch( )
	{	System.out.println("Watch the game");	}

	public static void main(String[] args)
	{
		Competition c = new Competition();
		c.watch();
	}
}