import java.util.*; 
import java.io.File;   
import java.io.FileWriter;       
import java.io.IOException;   
        
class CreateFile {  
           public static void main(String args[]) {  
               try {    
                       File file = new File("README.txt");   
                       if (file.createNewFile()) {  
                                  System.out.println("File " + file.getName() + " is created successfully.");  
                       } else {  
                                  System.out.println("File is already exist in the directory.");  
                       }  
                     } catch (IOException exception) {  
                              System.out.println("An unexpected error is occurred.");  
                              exception.printStackTrace();  
                  }   
        }  
} 