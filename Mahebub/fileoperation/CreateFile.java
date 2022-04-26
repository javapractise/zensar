package fileoperation;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			File f = new File("sample.txt");
			if(f.createNewFile()) {
				System.out.println("File is created: "+f.getName());
			} else {
				System.out.println("File is already exists.");
			}
		}
		catch(IOException e) {
			System.out.println("Error occured");
		}
	}
}
