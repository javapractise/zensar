class SubtractionTest{
	public void Subtraction(int num1,int num2){
	System.out.println("inside the super class method");
	System.out.println( num1-num2 );
	System.out.println(num1-num2-num3);
	}
}
 class Main extends SubtractionTest
{
	public void subtraction(int num1,int num2){
	System.out.println("inside the sub class method");
	System.out.println(num1-num2);
	}
	public static void main (String args[]){
		Main main = new Main();
		main.subtraction(150,100);
		}


}//overriding


	
	