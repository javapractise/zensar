//writeafile

package filehandling;

import java.io.FileWriter;

public class writeafile {

	public static void main(String[] args) {
		try
		{
		FileWriter obj=new FileWriter("D:hemanth.txt");
		obj.write("my name is hemanth");
		obj.close();
         System.out.println("successfull");
		}catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
