interface Print{
	void printMsg(String msg);
	default void print2()
	{
		System.out.println("\n\t!!	Print 2	 !!");
	}
}

class PrintDriver implements Print{
	public void printMsg(String msg)
	{
		System.out.println(msg);
	}
}

public class Functional{
	public static void main(String[] args)
	{
		PrintDriver pd = new PrintDriver();
		pd.printMsg("\n\t!!	     Hello world	 !!");
		pd.print2();
	}
}