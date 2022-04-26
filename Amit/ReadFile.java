import java.io.*;
import java.util.*;

class ReadFile{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("D:/firsrepo/zensar/Amit/Sample2.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
		{
			String data = sc.nextLine();
			System.out.println(data);
		}
	}
}