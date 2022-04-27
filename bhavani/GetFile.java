import java.io.file;
public class GetFile
{
public static void main(String args[])
{
File obj=new File("bhavani.txt");
if(obj.exists())
{
System.out.println("filename:"+obj.getName());
System.out.println("absolutepath:"+obj.AbsolutePath());
System.out.println("writeable:"+obj.canWrite());
System.out.println("readablee:"+obj.canRead());
System.out.println("filename:"+obj.length());


}
else
{
System.out.println("the file does not exist");
}
}
}

