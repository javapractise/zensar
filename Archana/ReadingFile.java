import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class ReadingFile {
	public static void main(String[] args) {
		try {
			File myObj = new File("file.txt");
      			Scanner sc = new Scanner(myObj);
     			while (sc.hasNextLine()) {
        			String data = sc.nextLine();
        			System.out.println(data);
     			}
      			sc.close();
    		} catch (FileNotFoundException e) {
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}
  	}
}