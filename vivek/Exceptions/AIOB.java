import java.util.Arrays;
import java.util.Scanner;

public class AIOBSample {

	public static void main(String[] args) {
		int[]  myArray= {10,20,30,40,50,60,70};
		System.out.println("elements are:");
		System.out.println(Arrays.toString(myArray));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index of required elements:");
		int element=sc.nextInt();
		System.out.println("elements in the given index is:"+myArray[element]);
		
			

	}

}