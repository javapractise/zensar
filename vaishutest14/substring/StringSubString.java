package Threaddemo;
import java.util.Scanner;



public class StringSubString {

	public static void main(String[] args) {
		String temp = "";
		try (Scanner sc = new Scanner(System.in)) {
			String string = sc.next();
			char arr[] = string.toCharArray();

			temp = string.substring(arr.length - 2);
		}
		System.out.println(temp);

	}

}