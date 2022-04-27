package vinaytest14;
import java.io.*;
public class Serialisation {
	public static void main(String args[]){    
	  try{    
	  //Creating the object    
		  Serialisation s = new Serialisation();    
	  //Creating stream and writing the object    
	  FileOutputStream fout=new FileOutputStream("f.txt");    
	  ObjectOutputStream out=new ObjectOutputStream(fout);    
	  out.writeObject(s);    
	  out.flush();    
	  //closing the stream    
	  out.close();    
	  System.out.println("success");    
	  }catch(Exception e){System.out.println(e);}    
	 }    
	}   