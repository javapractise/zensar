import java.io.*;     
 class Student implements Serializable{    
 String name;    
 int age;
 public Student(String name,int age) {     
  this.name = name;    
  this.age=age;    
 }    
}    
class withoutserial{    
 public static void main(String args[])throws Exception{    
  Student s =new Student("rohit",22);   
   
  FileOutputStream fos=new FileOutputStream("rohit3.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fos);    
  out.writeObject(s);    
  out.flush();    
  out.close();    
  fos.close();   
System.out.println("done");    
 }    
}    