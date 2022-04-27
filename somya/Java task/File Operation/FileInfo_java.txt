import java.util.*; 
import java.io.File; 
import java.util.Scanner ;
  
class FileInfo {  
    public static void main(String[] args) {  
         
        File file = new File("README.txt");  
        if (file.exists()) {  
              
            System.out.println("The name of the file is: " + file.getName());  
   
              
            System.out.println("The absolute path of the file is: " + file.getAbsolutePath());     
   
              
            System.out.println("Is file writeable?: " + file.canWrite());    
   
             
            System.out.println("Is file readable " + file.canRead());    
     
            System.out.println("The size of the file in bytes is: " + file.length());    
        } else {  
            System.out.println("The file does not exist.");  
        }  
    }  
}  