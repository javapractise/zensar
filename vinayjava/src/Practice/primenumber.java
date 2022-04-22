package Practice;

import java.util.Scanner;
public class primenumber {
	public static void main(String args[]){
		int temp=2,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		while(temp<=n){
			if(n%temp==0){
				count++;
			}temp++;
		}
		if(count==2)
			System.out.println("It is a prime number");
		else
			System.out.println("It is is not Prime number");
	}

}
