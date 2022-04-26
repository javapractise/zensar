import java.io.FileWriter;
public class WriteFile
{
public static void main(String args[])
{
String d="this is the data";
try
{
FileWriter output = new FileWriter("output.txt");
output.write(d);
System.out.println("the data is written to that file");
output.close();
}
catch(Exception e)
{
e.getStackTrace();
}
}
}