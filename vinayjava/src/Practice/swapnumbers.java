package Practice;
import java.util.*;
public class swapnumbers {

	public static void main(String[] args) {
						int First,Second,temp;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the First and Second values:");
				First=sc.nextInt();
				Second=sc.nextInt();
				temp=First;
				First=Second;
				Second=temp;
				System.out.println("After swapping"+First+" "+Second);

	}

}
