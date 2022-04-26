import java.io.*;
import java.util.*;

class FileNotFound{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("D:/firsrepo/zensar/Amit/Sample2.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				String data = sc.nextLine();
				System.out.println(data);
			}
		}
		catch( FileNotFoundException fe)
		{
			System.out.println(" FileNotFoundException is Handled");
		}
	}
}