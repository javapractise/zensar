interface Axis
{
void withdraw();
}
interface Hdfc
{
void savings();
}
class Bank implements Axis,Hdfc
{
public void withdraw()
{
System.out.println("withdraw amount from axis bank");
}
public void savings()
{
System.out.println("savings amount from hdfc bank");
}

}
class Multiple
{
public static void main(String args[])
{
Bank b=new Bank();
b.withdraw();
b.savings();
}
}