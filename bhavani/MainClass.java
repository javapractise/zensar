class Test
{
int x=10;
class Demo
{
int y=30;
}
}
class MainClass
{
public static void main(string args[])
{
Test t=new Test();
Test.Demo d=t.new Demo();
System.out.println(t.x+d.y);
}
}