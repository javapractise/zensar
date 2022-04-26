import java.io.*;
import java.util.Scanner;
import java.util.Scanner;
class WriteFile{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("D:/firsrepo/zensar/Amit/Sample.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text you want to insert into the file");
		String text = sc.nextLine();
		fw.write(text);
		fw.close();
	}
}