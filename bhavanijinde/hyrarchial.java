//hyrarchial inheritance real time example
class Prog_Lang
{
public void platform()
{
System.out.println("by using platform we can built the program" );
}
}
class Java extends Prog_Lang
{
public void version()
{
 System.out.println("the latest version of java is jdk1.8");
}
}
class Csharp extends Prog_Lang
{
public void csharp()
{
System.out.println("by using this platform we can build a program");
}
}
class MainLang
{
public static void main(String args[])
{
Csharp c=new Csharp();
c.platform();
c.csharp();
Java j=new Java();
j.platform();
j.version();
}
}