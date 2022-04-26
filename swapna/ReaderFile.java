import java.io.File;   
import java.io.FileNotFoundException;  
import java.util.Scanner;   
   
class ReaderFile
{  
    public static void main(String[] args) cmd
	{  
        try 
		{  
            
            File f1 = new File("myfile.txt");    
            Scanner dataReader = new Scanner(f1);  
            while (dataReader.hasNextLine()) 
			{  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) 
		{  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
    }  
}  

output:

C:\Users\SC67784\repo\SAMPLE>javac ReaderFile.java

C:\Users\SC67784\repo\SAMPLE>java ReaderFile.java
Unexcpected error occurred!