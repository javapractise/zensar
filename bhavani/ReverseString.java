import java.util.Scanner;

class ReverseString

{
public static void main(String args[])
{
System.out.println("enter a given string");
String s ="bhavani";
for(int i=s.length();i>0;--i)
{
System.out.println(s.charAt(i-1));
}
}
}