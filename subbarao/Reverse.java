public class Reverse
{
public static void main(String args[])
{
String string="Subbarao,Harish";
String reversedStr="";
for(int i=string.length()-1;i>=0;i--)
{
reversedStr=reversedStr+string.charAt(i);
}
System.out.println("original string:"+string);
System.out.println("reverse of given string:"+reversedStr);
}
}