class WhiteSpaces
{
public static void main(String args[])
{
String S="i am    working   in  zensar company";
System.out.println("before remove white spaces");
System.out.println("i am    working   in  zensar company");
S=S.replaceAll("\\s","");
System.out.println("after remove white spaces:\t"+S);
}
}