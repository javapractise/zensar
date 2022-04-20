class Pclass
{
privte void pclassmethod()
{
System.out.println("This is parent class");
}
}
class Childclass extends Pclass
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
Pclass p=new Pclass();
Childclass q=new Childclass();
p.pclassmethod();
q.childclassmethod();
q.pclassmethod();
}
}

