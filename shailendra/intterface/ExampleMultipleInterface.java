package com.java.pra.intterface;


interface Interface1
{
	void print();
}
interface Interface2
{
	void print();
	
}




public class ExampleMultipleInterface implements Interface1,Interface2 {

	public static void main(String[] args) {
		ExampleMultipleInterface multipleInterface =new ExampleMultipleInterface();
		multipleInterface.print();
		
	}

	@Override
	public void print() {
		System.out.println("print method called");
		
	}

}
