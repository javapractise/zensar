package com.java.java8feature;

@FunctionalInterface
 interface functionInterface
{
	void display();
	
}
public class FunctionalInterfaceImpl   {

	public static void main(String[] args) {

		functionInterface obj =() ->
		{
			System.out.println("Displayed ");
		};
		obj.display();
	}

	

}
