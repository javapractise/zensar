package fileoperation;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File f = new File("sample1.txt");
		if(f.exists()) {
			System.out.println("File name: "+f.getName());
			System.out.println("Absolute Path: "+f.getAbsolutePath());
			System.out.println("Writeable: "+f.canWrite());
			System.out.println("Readable: "+f.canRead());
			System.out.println("File size: "+f.length());
		} else {
			System.out.println("The file does not exist.");
		}
	}

}
