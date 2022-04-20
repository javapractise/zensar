class Parentclass
{
void parentclassmethod()
{
System.out.println("This is parent class");
}
}
class Childclass extends Parentclass
{
void childclassmethod()
{
System.out.println("This is child class");
}
}
class test
{
public static void main(String[] args)
{
Parentclass p=new Parentclass();
Childclass q=new Childclass();
p.parentclassmethod();
q.childclassmethod();
q.parentclassmethod();
}
}

