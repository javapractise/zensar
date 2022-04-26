import java.io.File;   
class GetFileContent {  
    public static void main(String[] args)
	{  
        
        File f0 = new File("C:Getfilecontent.txt");  
        if (f0.exists()) 
		{  
              
            System.out.println("The name of the file is: " + f0.getName());  
   
              
            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());     
   
             
		} 
		else
		{  
            System.out.println("The file does not exist.");  
        }  
    }  
}  

output:

C:\Users\SC67784\repo\SAMPLE>javac GetFileContent.java

C:\Users\SC67784\repo\SAMPLE>java GetFileContent.java
The name of the file is: Getfilecontent.txt
The absolute path of the file is: C:\Users\SC67784\repo\SAMPLE\Getfilecontent.txt
