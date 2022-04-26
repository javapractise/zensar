package training9;

import java.io.FileReader;

class ReadingFile {
	public static void main(String[] args) {

		char[] array = new char[100];
		try {
			
			FileReader file = new FileReader("Akhil.txt");

			file.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);

			file.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}

