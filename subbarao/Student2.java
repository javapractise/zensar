import java.io.*;
import java.io.Serializable; 
class Child implements Serializable{

String stu_Name;
Child(String stu_Name) {
this.stu_Name=stu_Name;
}
}
public class Student2 extends Child {   // Is-A      
String stu_Addr;
int stu_Id;
public Student2 (String stu_Name, String stu_Addr, int stu_Id) {
super (stu_Name);
this.stu_Addr=stu_Addr;
this.stu_Id=stu_Id;
}
public static void main(String[] args) {
Student2 s=new Student2 ("George", "ABC, XYZ", 1);
try{

FileOutputStream fileOut = new FileOutputStream("s.txt");

ObjectOutputStream out = new ObjectOutputStream(fileOut);
out.writeObject(s);
out.close();
fileOut.close();
System.out.println("Object serialized and saved in s.txt");
} 
catch (IOException i) {
i.printStackTrace();
}
}
} 