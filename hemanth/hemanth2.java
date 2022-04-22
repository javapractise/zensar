package wrapper;

import java.util.Scanner;

public class stringignore {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	String s3=sc.next();
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s2.equalsIgnoreCase(s3));
	System.out.println(s3.equalsIgnoreCase(s1));

	}

}
