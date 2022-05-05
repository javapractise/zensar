import java.util.*;

interface EvenOdd {
	void check(int a);
}

public class EvenOdd {
	public static void main(String[] args) {

		EvenOdd evenOdd = (int a) -> {
			if(a%2==0){
				System.out.println("Number "+a+" is even.");
			}else{
				System.out.println("Number "+a+" is odd.");
			}
		};
		
		evenOdd.check(9);
		evenOdd.check(2);
	}
}