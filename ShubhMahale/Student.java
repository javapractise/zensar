import java.util.*;

public class Student {
    String name;
    int roll_no;
}
public class TestStudent { 
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.roll_no = 2;       
        System.out.println("Name is " + s.name + " add 	roll number is " + s.roll_no);
    }
}