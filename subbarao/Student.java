import java.io.*;
public class Student implements java.io.Serializable{
public String stu_Name;
public String stu_Addr;
public int stu_Id;
public static void main(String [] args) {
Student s = new Student ();
s.stu_Name = "George";
s.stu_Addr = "ABC, XYZ"; 
s.stu_Id = 1;

try{
FileOutputStream fileOut = new FileOutputStream("s.txt");

ObjectOutputStream out = new ObjectOutputStream(fileOut);
out.writeObject(s);
out.close();
fileOut.close();

System.out.printf("Object serialized and saved in s.txt");
}

catch (IOException i) { 

i.printStackTrace();
}

}
} 