class SubtractionTest{
	public void Substraction(int num1,int num2){
	System.out.println(num1-num2);
	}
	public void Substraction(int num1,int num2,int num3){
	System.out.println(num1-num2-num3);
	}
}
	public class Main
	{
	public static void main (String args[]){
	SubstractionTest substractionTest = new SubstractionTest();
	substractionTest.substraction(150,100);
	substractionTest.substraction(150,100,20);
	
	}
  }//overloading 