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
   
anusha/anusha1.java

package wrapper;

public class unboxing {

	public static void main(String[] args) {
		Integer a= new Integer(2);
		int i=a.intValue();
		System.out.println(a+" "+i);
     Character ab=new Character('m');
     char b=ab.charValue();
     System.out.println(ab+" "+b);
	}

}
 
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
package javapractice;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

	}

} 
 
package javapractice;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		if(str1.equals(str))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
 
package javapractice;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		String str2=" ";
		str2=str;
		str=str1;
		str1=str2;
			System.out.println(str);

			System.out.println(str1);


	}

} 
 
package javapractice;

import java.util.Scanner;

public class stringreverse {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);

	String str =sc.next();


	divideString(str, 4);
	}

	static void divideString(String str, int n)
	{
		int string_size = str.length();
		int part_size;


		if (string_size % n != 0) {
			System.out.println("Invalid  String size"
								+ "is not divisible by n");
			return;
		}
		part_size = string_size / n;

			for (int i = 0; i < string_size; i++) {
				if (i % part_size == 0)
					System.out.println();
				System.out.print(str.charAt(i));
			}
		}

	} 
 
package javapractice;

import java.util.Scanner;

public class stringreverse {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		String str =sc.next();
		String str1=str.replaceAll("\\s","");
		System.out.println(str1);

	}

	} 
 
package javapractice;

import java.util.Scanner;

public class stringreverse {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		String str =sc.next();
		String str1=str.substring(5);
		System.out.println(str1);
		str1=str.substring(2, 5);
		System.out.println(str1);

	}

	} 
 
package javapractice;

class Wrapper {

	private int i;

	public void setValue(int i) {
		this.i = i;
	}

	public int getValue() {
		return i;
	}

	public String toString() {
		return Integer.toString(i);
	}
}

public class test1 {

	public static void main(String[] args) {

		Wrapper j = new Wrapper();
		j.setValue(10);
		System.out.println(w.getValue());
		j.toString();
		System.out.println(j.getValue());


	}

} 
