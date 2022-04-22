import java.util.Arrays;

class Anagram

{
public static void main(String args[])
{
String s1="jinde";
String s2="bhava";
s1=s1.toLowerCase();
s2=s2.toLowerCase();
if(s1.length()==s2.length())
{
char[] charArray1=s1.toCharArray();
char[] charArray2=s2.toCharArray();
Arrays.sort(charArray1);
Arrays.sort(charArray2);
boolean result=Arrays.equals(charArray1,charArray2);
if(result)
{
System.out.println(s1+ "and" +s2+ "are anagram");
}
else
{
System.out.println(s1+"and"+s2+ "are not anagram");
}
} 
}
}

