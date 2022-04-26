package fileoperation;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		try {
			File f = new File("sample1.txt");
			Scanner scan = new Scanner(f);
			while(scan.hasNextLine()) {
				String s = scan.nextLine();
				System.out.println(s);
			}
			scan.close();
		} catch(FileNotFoundException e) {
			System.out.println("Error occurred");
		}
	}
}
