package training9;

import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) {


		String data = "This is a akhil file";

		try {
			FileWriter file = new FileWriter("Akhil.txt");
			file.write(data);
			System.out.println("Data is written");

			file.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}