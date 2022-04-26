import java.io.*;
import java.util.Scanner;

class GetFileInfo{
	public static void main(String[] args)
	{
		File file = new File("D:/firsrepo/zensar/Amit/Sample.txt");
		if(file.exists())
		{
			System.out.println("File Name : "+file.getName());
			System.out.println("File Location : "+file.getAbsolutePath());
			System.out.println("Whether a File is Readable : "+file.canRead());
			System.out.println("Whether a File is Writable : "+file.canWrite());
			System.out.println("File Length : "+file.length());
		}
	}
}