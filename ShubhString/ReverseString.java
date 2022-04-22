// ReverseString in Java

import java.util.*;
import java.util.lang; 
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ReverseString {

   public static void main(String args[])  
 {  
    String s;  
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter a String: ");  
    s=sc.nextLine();  
                  
    System.out.print("After reverse string is: ");  
    for(int i=s.length();i>0;--i)
    {  
    	System.out.print(s.charAt(i-1));  
    }  
   }  
 } 