// Palindrome in Java

import java.util.*;
import java.util.lang; 
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Palindrome
{
public static void main(String args[])
{
String s1="NayaN",reversestr="";
int s1Length = s1.length();
for(int i=(s1Length-1);i>=0;--i)
{
reversestr=reversestr+s1.charAt(i);
}
if(s1.toLowerCase().equals(reversestr.toLowerCase()))
{
System.out.println(s1+"is a palindrome string:");
}
else
{
System.out.println(s1+"is not  a palindrome string:");
}
}
}