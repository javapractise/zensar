interface EvenOdd
{
void check(int a);
}
public class LambdaExample{
public static void main(String args[])
{
EvenOdd evenodd=(int a)->{
if(a%2==0)
{
System.out.println(a+""+"is even");
}
else
{
System.out.println(a+""+"is odd");
}
};
evenodd.check(5);
evenodd.check(8);
}
}