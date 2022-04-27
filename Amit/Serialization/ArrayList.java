import java.io.*;
import java.util.*;

public class ArrayList{
	public static void main(String[] args) throws Exception
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("Mike");
		name.add("John");
		
		try
		{
			FileOutputStream fos = new FileOutputStream("Sample.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(name);
			oos.close();
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println("exception is get Handelled");
		}
	}
}