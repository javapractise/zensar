import java.io.*;
import java.io.Serializable;

class SerializationDemo {

	public static void main(String args[]){    
  		try{    
	             SerializationDemo obj = new SerializationDemo();
        
  		     FileOutputStream fout=new FileOutputStream("f.txt");
    
  		     ObjectOutputStream out=new ObjectOutputStream(fout);
    
                     out.writeObject(obj);
    
                     out.flush();    
    
                     out.close();
    
  		     System.out.println("Success!");
    
                  }catch(Exception e)
		  {
		   System.out.println(e);
		}    
 	}    
}