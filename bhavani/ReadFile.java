import java.io.FileReader;
public class ReadFile
{
public static void main(String args[])
{
char[] ch=new char[50];
try
{
FileReader input = new FileReader("input.txt");
input.read(ch);
System.out.println("the data is there");
System.out.println(ch);
input.close();
}
catch(Exception e)
{
e.getStackTrace();
}
}
}