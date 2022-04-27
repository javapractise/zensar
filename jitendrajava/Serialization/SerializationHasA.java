import java.io.*;
import java.io.Serializable;

class Address{
String stu_hNo, stu_City, stu_State;
public Address (String stu_hNo, String stu_City, String stu_State) {
this.stu_hNo=stu_hNo;
this.stu_City=stu_City;
this.stu_State=stu_State;
}
}
public class Student implements Serializable {
int stu_Id;
String stu_Name;
Address address, //HAS-A
public Student (int stu_Id, String stu_Name) {
this.stu_Id=stu_Id;
this.stu_Name=stu_Name;
}

}