public class palindrome 
{
     
 	public static void main(String args[]) 
	{
     		 int r, sum = 0, temp;
     		 int m = 454;
     		 int n = m;
     		 temp = n;
     		 while (n > 0) {
        		 r = n % 10;
         		sum = (sum * 10) + r;
         		n = n / 10;
            }
       if (temp == sum)
       {
        System.out.println(m + " is a palindrome number.");
        } 
       else 
     {
        System.out.println(m + "is not a palindrome number.");
     }
   }
}
