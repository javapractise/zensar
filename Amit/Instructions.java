// Multiple Inheritance

interface Cricket{
	public void watch();
	public void play();
}

interface Football{
	public void watch();
	public void result();
}

public class Instructions implements Cricket, Football{
	public void watch()
	{
		System.out.println("\nWatch the Game");
	}
	public void play()
	{
		System.out.println("\nPlay the Game");
	}
	public void result()
	{
		System.out.println("\nAt last the game is winner");
	}
	public static void main(String[] args)
	{
		Instructions i = new Instructions();
		i.watch();
		i.play();
		i.result();
	}
}
