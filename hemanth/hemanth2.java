//inner class



package methods;



public class Outerclass {
static int i=45;
class innerclass{
void msg()
{
System.out.println("displaying the data :"+i);
}



public static void main(String[] args) {
Outerclass obj=new Outerclass();
Outerclass.innerclass a=obj.new innerclass();
a.msg();




}



}
}