package vinaytest14;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;  
public class withoutinheritence implements Serializable{  
 int id;  
 String name; 
double sal; 
 public withoutinheritence(int id, String name,double sal) {  
  this.id = id;  
  this.name = name;  
  this.sal = sal; 
 }  
}     
class Persist{    
 public static void main(String args[]){    
  try{     
	  withoutinheritence e =new withoutinheritence(211,"ravi",50000.00);      
  FileOutputStream fout=new FileOutputStream("f.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(e);    
  out.flush();     
  out.close();    
  System.out.println("success");    
  }
catch(Exception e)
    {
   System.out.println(e);
     }    
 }    
}    