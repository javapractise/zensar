/create a file

package filehandling;

import java.io.File;

public class createfile {

	public static void main(String[] args) {
		try {
		File obj=new File("D:hemanth.txt");
		if(obj.createNewFile())
		{
			System.out.println("file"+obj.getName()+"is created");
		}
		else
		{
			System.out.println("file is already created");
		}
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
			e.printStackTrace();
		}

	}

}