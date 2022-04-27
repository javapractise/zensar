import java.io.*;
public class FilenotFound {





public static void main(String[] args) throws IOException
{


FileReader reader = new FileReader("file.txt");


BufferedReader br = new BufferedReader(reader);

// declaring empty string
String data =null;

// while loop to read data
// and printing them
while ((data = br.readLine()) != null)
{
System.out.println(data);
}

// closing the object
br.close();
}
}
