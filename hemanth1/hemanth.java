package wrapper;

import java.util.Scanner;

public class charstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		char[] str=st.toCharArray();
		int len=str.length;
		System.out.print(str[len-2]);
		System.out.print(str[len-1]);

	}

}
