import java.io.FileWriter;

public class Write {

	public static void main(String[] args) {
		String data = "this is the data tp write in the file";
		try {
			FileWriter output = new FileWriter("output .txt");
			
			System.out.println("data is written to the file");
			
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
			
			
			
		}

	}

}