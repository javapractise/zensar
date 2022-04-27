import java.io.*;
import java.io.Serializable;
public class StaticSerialization implements Serializable{
static int x =60;
public static void main(String[] args) {
StaticSerialization o= new StaticSerialization();
System.out.println("Serialization successful, static member value :" + x);

try{

FileOutputStream f= new FileOutputStream("s.txt"); 
ObjectOutputStream ob= new ObjectOutputStream(f);
ob.writeObject(o);
ob.close();
x=58;
FileInputStream fi= new FileInputStream("s.txt");
ObjectInputStream oi= new ObjectInputStream(fi);
o=(StaticSerialization) oi.readObject();

oi.close();
System.out.println("After Deserialization, static member has value: "+ x);
}

catch(Exception e) {
System.out.println(e);
}
}
}