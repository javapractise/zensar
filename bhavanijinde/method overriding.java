//method overriding real time example
class Engineer
{
public void Work()
{
System.out.println("engineer works");
}
}
class Software extends Engineer
{
public void work()
{
System.out.println("softwareengineer works");
}
}
class Hardware extends Engineer
{
public void work()
{
System.out.println("hardwareengineer works");
}
}
class Demo21
{
public static void main(String args[])
{
Software s= new Software();
s.work();
Hardware H= new Hardware();
H.work();
}
}