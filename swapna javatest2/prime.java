import java.lang.*;
import java .io;
class prime 
{
	public static void main(String args[])ThrowsIOException
	{
	
	 BufferedReader br = new BufferedReader( new = InputStreamReader(System.in));
	int c=0;
	System.out.println("enter the number");
	int n =Interger.parseInt(br.readline());
	for (int i=1;i<=n;i++)
	{
		if(n%i ==0)
		{
			c++;
		}
	}
	if(c<=2)
	{
		System.out.println("given number is not a prime");
	}
    }


}	

