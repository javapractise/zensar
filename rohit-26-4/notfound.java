
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class notfound {
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
		
		catch(FileNotFoundException e)
		{
			System.out.println("File not found exception raised");
		}
	}

}
