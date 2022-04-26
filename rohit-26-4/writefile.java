
import java.io.FileWriter;
import java.io.IOException;

public class writefile {
	public static void main(String[] args)
	{
		try {
			FileWriter f1=new FileWriter("rohitfile.txt");
			f1.write("this is file which is created and writed by using file handling");
			f1.close();
			System.out.println("wrote in file successfully");
		}catch(IOException e)
		{
			System.out.println("Error occured while writting");
		}	
	}

}
