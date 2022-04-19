//1. Reverse a string \\

public class ReverseAString{
  public static void main(String args[]){
String name="Jitendra";
int length=name.length();
String rev="";
for(int i=length-1; i>=0;i--)
{
rev=rev+name.charAt(i);
}
System.out.println("Reverse of "+name+" is "+rev);
}
}
