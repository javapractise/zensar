package exception;

import java.io.*;

public class FileNotFound {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("Java.txt");
			BufferedReader br = new BufferedReader(fr);
			String fileData = null;
			while ((fileData = br.readLine()) != null) {
				System.out.println(fileData);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound exception occurred");
			e.printStackTrace();
		}
	}
}
