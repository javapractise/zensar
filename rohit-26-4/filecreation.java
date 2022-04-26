

import java.io.File;
import java.io.IOException;

public class filecreation {
	public static void main(String[] args)
	{
		try {
			File file1= new File("rohitfile1.txt");
			if(file1.createNewFile())
			{
				System.out.println("File created with name :"+file1.getName());
			}
			else
			{
				System.out.println("File already exists" +file1.getName());
			}
		}
		catch(IOException e){
			System.out.println("Error occured");
		}
	}

}
