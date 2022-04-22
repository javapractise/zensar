package Practice;

public class reversestring {
	public static void main(String args[]){
		String string="markram";
		String a="";
		for(int i=string.length()-1;i>=0;i--){
			a=a+string.charAt(i);
		}
		System.out.println("The reverse string is:"+a);
	}
}