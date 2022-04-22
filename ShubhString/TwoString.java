// TwoString in Java
import java.util.*;
import java.util.lang; 
import java.util.Scanner;

public class TwoString {

public static void main(String[] args)
    {
        String columnist1 = "Shubham";
        String columnist2 = "Shubham";
        String columnist3 = "John Snow";

       
boolean equals1 = columnist1.equalsTwoString(columnist2);
boolean equals2 = columnist1.equalsTwoString(columnist3);
System.out.println();
      
System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist2 + "\"? " + equals1);
System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist3 + "\"? " + equals2);
System.out.println();
    }
}