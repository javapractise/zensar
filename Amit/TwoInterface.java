// One interface extends another interface

interface Games{
	public void cricket();
	public void football();
}

interface People extends Games{
	public void cricketFans();
	public void footballFans();
}

class Competition implements People{
	public void cricket()
	{
		System.out.println("\nCricket Game is ON");
	}
	public void football()
	{
		System.out.println("\nFootball Game is started");
	}
	public void cricketFans()
	{
		System.out.println("\nCricket is  Popular Game");
	}
	public void footballFans()
	{
		System.out.println("\nFootball is Best Game");
	}
}

class TwoInterface{
	public static void main(String[] args)
	{
		Competition c = new Competition();
		c.cricket();
		c.football();
		c.cricketFans();
		c.footballFans();
	}
}