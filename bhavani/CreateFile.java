import java.io.File;
public class CreateFile
{
public static void main(String args[])
{
File obj=new File("newfile.txt");
try
{
boolean value=obj.createNewFile();
if(value)
{
System.out.println("the new file is created");
}
else
{
System.out.println("the file already exist");
}
}
catch(Exception e)
{
e.getStackTrace();
}
}
}
