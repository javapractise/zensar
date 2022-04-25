class Outerclass{
	int x =10;
	
 class InnerClass{
	int y = 5;
 }
 }
 public class Inner{
	public static void main (String args[]){
	Outerclass myOuter = new Outerclass();
	Outerclass.InnerClass myInner = myOuter.new InnerClass();
	System.out.println(myInner.y + myOuter .x);
	}
 }
