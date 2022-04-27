package training9;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {

		File file = new File("Akhil.txt");

		System.out.println("File Name: " + file.getName());
		System.out.println("File path: " + file.getPath());
		System.out.println("File Absolute Path: " + file.getAbsolutePath());
		System.out.println("File size: " + file.length());

	}

}