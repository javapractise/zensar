package wrapper;

public class autobox {

	public static void main(String[] args) {
		int i=10;
		char inti='m';
		Character b=Character.valueOf(inti);
		Integer a=Integer.valueOf(i);
		Integer j=a;
		Integer g=j;
		System.out.println(i+" "+a+" "+j+" "+g);
		System.out.println(b);
	}

}
