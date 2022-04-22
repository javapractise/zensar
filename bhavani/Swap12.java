import java.util.*;
class Swap12
{
public static void main(String args[])
{
String a="program";
String b="practice";
a=a+b;
b=a.substring(0,a.length()-b.length());
a=a.substring(b.length());
System.out.println("strings before swap:"+a+ "," +b);
}
}
