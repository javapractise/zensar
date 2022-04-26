//filenotfound
package filehandling;

import java.io.File;
import java.io.FileReader;

public class fileexception {

	public static void main(String[] args) {
		File obj=new File("D:hemanth.txt");
		try {
		obj.exists();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}