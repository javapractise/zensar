class CountLength{
 public static void count(String str)
{
 char[] ch=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
String s="";
while(i<ch.length&&ch[i]!=' ')
{
s=s+ch[i];
i++;
}
if(s.length()>0)
System.out.println(s+ "-"+ s.length());
}
}
public static void main(String args[])
{
String str="coding test";
count(str);
}
} 