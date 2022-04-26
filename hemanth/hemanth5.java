//readfile

package filehandling;

import java.io.FileReader;
import java.util.Scanner;

public class readfile {

	public static void main(String[] args) {
		try {
			FileReader obj=new FileReader("D:hemanth.txt");
			Scanner sc=new Scanner(obj);
			while(sc.hasNext())
			{
				String str=sc.next();
				System.out.println(str);
			}
			sc.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}

	}

}