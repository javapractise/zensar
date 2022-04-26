import java.io.*;

class CreateFile{
	public static void main(String[] args) throws IOException
	{
		File file = new File("D:/firsrepo/zensar/Amit/Sample.txt");
		if(file.createNewFile())
		{
			System.out.println("File is get created at "+file.getCanonicalPath()+" with name "+file.getName());
		}
		else
		{
			System.out.println("File Already Exist");
		}
		
	}
}