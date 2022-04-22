public class Frequency
{
public static void main(String args[])
{
String s= "practice program";
int[] freq=new int[s.length()];
int i,j;
char string[]=s.toCharArray();
for(i=0;i<s.length();i++)
{
freq[i]=1;
for(j=i+1;j<s.length();j++)
{
if(string[i]==string[j]){
freq[i]++;
string[j]='0';
}
}
}
System.out.println("charcters and their corresponding freq");
for(i=0;i<freq.length;i++)
{
if(string[i]!=' '&&string[i]!='0')
System.out.println(string[i]+"-"+freq[i]);
}
}
}