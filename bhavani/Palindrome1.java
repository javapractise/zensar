class Palindrome1
{
public static void main(String args[])
{
String s1="madam",reversestr="";
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