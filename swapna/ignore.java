public class ignore
{
	public static void main (String args[])
	{
	String myStr1 = "swapna";
	String myStr2 = "SWAPNA";
	String myStr3 = "another String";
	System.out.println(myStr1.equalsIgnoreCase(myStr2));
    System.out.println(myStr1.equalsIgnoreCase(myStr3));
  
	}
}