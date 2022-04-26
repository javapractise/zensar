package fileoperation;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("sample1.txt");
			fw.write("This is a sample file for java file writer.");
			fw.close();
			System.out.println("Successfully wrote to the file.");
		}
		catch(IOException e) {
			System.out.println("Error occured");
		}
	}

}
