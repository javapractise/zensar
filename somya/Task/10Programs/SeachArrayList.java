import java.util.ArrayList;
import java.util.Scanner;

public class SeachArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please Enter Name in List");
	String string=	scanner.next();
	list.add(string);
		list.add("Somu");
		list.add("Ram");
		list.add("Neha");
		list.add("Sweety");
		list.add("Supriya");
		
		System.out.println("Typr Name to Search");
		
		String s =scanner.next();;
		
	System.out.println(	list.contains(s));
		
		

	}

}