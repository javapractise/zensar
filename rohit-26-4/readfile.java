

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readfile {
	public static void main(String[] args)
	{
		try {
			File f1= new File("rohitfile");
			Scanner sc=new Scanner(f1);
			while(sc.hasNextLine())
			{
				String s=sc.nextLine();
				System.out.println(s);
			}
			sc.close();
		}
		
		catch(IOException e)
		{
			System.out.println("Error occured while reading");
		}
	}

}
