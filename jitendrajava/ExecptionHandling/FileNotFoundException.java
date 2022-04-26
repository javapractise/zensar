package javaprogram;

public class FileNotFoundException {
	public static void main(String[] args) {
		File file = new File("myFile");
	   FileInputStream fis = new FileInputStream(file);
	   System.out.println("Hello Java");
	}

}
