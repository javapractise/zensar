interface show8 
{
	public void display();
	
	
}
interface show1
{
	public void display1();
		
	
}
class show2 implements show8,show1
{
	public void display(){
	System.out.println("this is interface show");
	}
	public void display1(){
	System.out.println("this is interface show1");
	}
	public static void main(String args[]){
	show2 s = new show2();
	s.display();
	s.display1();
	}
}