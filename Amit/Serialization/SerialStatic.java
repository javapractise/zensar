import java.io.*;

class Person implements Serializable{
	private static String name;

	Person(String name)
	{
		this.name = name;
	}
	public static String getName()
	{
		return name;
	}
	public static void setName(String name)
	{
		Person.name = name;
	}
}

public class SerialStatic{
	public static void main(String[] args)
	{
		try
		{
			Person p1 = new Person("Mike");
			FileOutputStream fos = new FileOutputStream("Sample.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
		}
		catch(Exception e)
		{
			System.out.println("Exception is Handelled");
		}
		try
		{
			FileInputStream fis = new FileInputStream("Sample.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person p2 =(Person)ois.readObject();
			System.out.println(p2.getName());
		}
		catch(Exception e)
		{
			System.out.println("Exception is Handelled");
		}
	}
}