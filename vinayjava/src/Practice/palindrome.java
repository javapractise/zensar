package Practice;
import java.util.*;
public class palindrome {
	public static void main(String[] args) {
				int rem,rev=0,temp,number;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value of number:");
				number=sc.nextInt();
				temp=number;
					while(number>0){
						rem=number%10;
						rev=(rev*10)+rem;
						number=number/10;
					}
				if(rev==temp)
					System.out.println("The number is palindrome");
				else
					System.out.println("Not a Palindrome");
			}
	}

