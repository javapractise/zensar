class Wrapper {

	private int it;
	  
	Wrapper(int i)
	{
	 	this.it = i;
	 }
	  
	public int getValue()
	{
	 	return it;
	 }
	  
	public void setValue(int i)
	{
	 	this.it = i;
	 }
	  
	public String toString() 
	{
	 	return Integer.toString(it);
	 }
}
public class WrapperDriver {
	public static void main(String[] args) 
	{
		Wrapper w = new Wrapper(10);
		System.out.println(w);
	    	w.setValue(20);
	    	System.out.println(w.getValue());
	    	
	 }
}