import java.util.*; 
import java.io.*;   

public class ArithmeticException {  
	void divide(int a, int b)  
	{  
 
		int res = a / b;  
		System.out.println("Division process has been done successfully.");  
		System.out.println("Result came after division is: " + res);  
	}  
   
	public static void main(String argvs[]){  
  		ArithmeticException obj = new ArithmeticException();  
		obj.divide(1, 0);  
	}  
}  
