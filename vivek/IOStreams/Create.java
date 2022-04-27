import java.io.File;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("javaFile.java");
		try {
			boolean value=file.createNewFile();
			if(value) {
				System.out.print("New java file is created");
			}
			else {
				System.out.print("The file already exists");
			}
				
			}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}