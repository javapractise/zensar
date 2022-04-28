import java.io.*;

class Fruit implements Serializable{
	String origin;
	int prize;

	Fruit(String origin, int prize)
	{
		this.origin = origin;
		this.prize = prize;
	}
}

class Apple extends Fruit{
	String colour;
	String taste;

	public Apple(String origin, int prize, String colour, String taste)
	{
		super(origin, prize);
		this.colour = colour;
		this.taste = taste;
	}
}

public class Serialize{
	public static void main(String[] args)
	{
		try
		{
			Apple a = new Apple("Kashmir", 100, "Red", "Sweet");
			FileOutputStream fos = new FileOutputStream("Sample.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			oos.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println("Exception is handelled");
		}
		try
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Sample.txt"));
			Apple a2 = (Apple)in.readObject();
			System.out.println("Origin : "+a2.origin+"\nPrize : "+a2.prize+"\nColour : "+a2.colour+"\nTaste : "+a2.taste);
			in.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception is Handelled");
		}
	}
}