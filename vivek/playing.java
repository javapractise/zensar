interface Playing{
	public void watch();

	interface Cricket{
		public void cricketFans();
	}
	interface Football{
		public void footballFans();
	}
	public static void result()
	{
		System.out.println("\nAt last the game is winner");
	}
	default void players()
	{
		System.out.println("\nWe are here to win");
	}
}

public class GamesDriver implements Games{
	public void watch()
	{
		System.out.println("\nFans are watching the games");
	}
	public void cricketFans()
	{
		System.out.println("\nCricket is on Fire");
	}
	public void footballFans()
	{
		System.out.println("\nFootball is going on High");
	}

	public static void main(String[] args)
	{
		Playing p = new Playing();
		p.watch();
		p.cricketFans();
		p.footballFans();
		Games.result();	
		p.players();	
	}
}