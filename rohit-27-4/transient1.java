import java.io.*;     
 class Student implements Serializable{    
 String name;    
 transient int age;
 public Student(String name,int age) {     
  this.name = name;    
  this.age=age;    
 }    
}    
class transient1{    
 public static void main(String args[])throws Exception{    
  Student s =new Student("ravi",22);   
   
  FileOutputStream fos=new FileOutputStream("rohit3.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fos);    
  out.writeObject(s);    
  out.flush();    
  out.close();    
  fos.close();    
  
ObjectInputStream in=new ObjectInputStream(new FileInputStream("rohit3.txt"));    
  Student s1=(Student)in.readObject();    
  System.out.println("age"+s1.age);
 System.out.println("name"+s1.name);        
  in.close();    
 }    
}    