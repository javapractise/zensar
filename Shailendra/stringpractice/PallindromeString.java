
public class PallindromeString {

	public static void main(String[] args) {
	String s ="radar";
	// sArray[] =s.toCharArray();
	int length =s.length();
	String rev ="";
	for(int i=length-1;i>=0;i--)
	{
rev = rev + s.charAt(i);
	
	}
	
	System.out.println(rev);
	if(s.toLowerCase().equals(rev.toLowerCase()))
	{
		System.out.println(s+ " :is pallindrome");
	}
	else
		System.out.println(s+" :is not pallindrome");
	}
	
}


