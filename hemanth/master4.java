class SubTest{
	public void Sub(int num1,int num2){
	System.out.println(num1-num2);
	}
	public void Sub(int num1,int num2,int num3){
	System.out.println(num1-num2-num3);
	}
public static void main (String args[]){
	SubTest obj = new SubTest();
	obj.sub(150,100);
	obj.sub(150,100,20);
}
}