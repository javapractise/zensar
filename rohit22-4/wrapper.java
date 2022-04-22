
class wraperx{
	private int i;
	void display(){}
	void diaplay(int i)
	{
		this.i=i;
	}
	public int getValue() {
		return i;
	}
	public void setValue(int i){  
	this.i=i;  
	}
	public String  toString() {
		return Integer.toString(i);
	}
}

public class wrapper {
	public static void main(String[] args)
	{
		wraperx w= new wraperx(100);
		System.out.println(w);
		
	}

}
