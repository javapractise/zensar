import java.io.*;
public class FilenotFound {
	public static void main(String[] args) throws IOException{
		FileReader reader = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(reader);
		String data =null;
		while ((data = br.readLine()) != null){
			System.out.println(data);
		}
		br.close();
	}
}
