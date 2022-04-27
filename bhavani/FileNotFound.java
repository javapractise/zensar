import java.io.*;
class FileNotFound
{
public static void main(String args[])
{
FileReader fileReader =new FileReader("test.txt");
BufferedReader bufferedReader = new BufferedReader(fileReader);
String fileData=null;
while((fileData=bufferedReader.readLine()!=null))
{
Sytem.out.println(fileData);
}
try
{
bufferReader.close();
}
catch(IOException e)
{
e.printStackTrace();
}
}
}