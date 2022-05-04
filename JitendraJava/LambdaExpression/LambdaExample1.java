package javaprogram;

// To check number is even or odd using Lambda Expression

interface EvenOdd {
	void check(int a);
}

public class LambdaExample1 {
	public static void main(String[] args) {
		// Lambda Expression
		EvenOdd evenOdd = (int a) -> {
			if(a%2==0){
				System.out.println("Number "+a+" is even.");
			}else{
				System.out.println("Number "+a+" is odd.");
			}
		};
		
		//Check numbers
		evenOdd.check(5);
		evenOdd.check(8);
	}
}