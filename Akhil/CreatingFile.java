package training9;

import java.io.File;

public class CreatingFile {

	public static void main(String[] args) {
		
		File file = new File("Akhil.txt");
		
		try {
			
			boolean value = file.createNewFile();
			if(value) {
				System.out.println("New file created");
			} else {
				System.out.println("File already exists");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
