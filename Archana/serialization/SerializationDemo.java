import java.io.*;
class SerializationDemo {
	public static void main(String args[]){     
		try{    
			SerializationDemo  s = new SerializationDemo();    					FileOutputStream fout=new FileOutputStream("file.txt");    
			ObjectOutputStream out=new ObjectOutputStream(fout);    				out.writeObject(s);    
  			out.flush();    
  			//closing the stream    
 			out.close();    
  			System.out.println("success");    
  		}catch(Exception e){System.out.println(e);}    
	 }    
}    