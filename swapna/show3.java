interface show 
{
	public void display();
}
interface show1
{
	public void display1();
}
interface show2 extends show,show1
{
	public void display2();
}
class show3 implements show2
{
	public void display(){
	System.out.println("this is show interface");
	}
	public void display1(){
	System.out.println("this is show1 interface");
	}
	public void display2(){
	System.out.println("this is show2 interface");
	}
	public static void main (String args[]){
		show3 s = new show3();
		s.display();
		s.display1();
		s.display2();
		
	}
	
}