
public class palindrome
{
	public static void main(String[] args)
	{
		int temp,digit,sum=0;
		int num=151;
		temp = num;
		while(num>0)
		{
			digit=num%10;
			sum=(sum*10)+digit;
			num=num/10;
		}
		if(sum==temp){
			System.out.println("the number is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}		
}
