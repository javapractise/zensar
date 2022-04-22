class Reverse
{
public static void main(String args[])
{
String s="bhavani",nstr=" ";
char ch;
System.out.print("original word:");
System.out.println("bhavani");
for(int i=0;i<s.length();i++)
{
ch=s.charAt(i);
nstr=ch+nstr;
}
System.out.print("reversed word:"+nstr);
}
}


