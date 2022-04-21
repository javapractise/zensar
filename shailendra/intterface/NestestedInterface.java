package com.java.pra.intterface;

interface interface1 {
	void interfaca1print();

	interface nestedinterface {
		public void nestedprint();

		void interfaca1print();
	}
}

public class NestestedInterface implements interface1.nestedinterface {

	public static void main(String[] args) {
		NestestedInterface nestestedInterface = new NestestedInterface();
		nestestedInterface.interfaca1print();
		nestestedInterface.nestedprint();
	}

	@Override
	public void interfaca1print() {
		System.out.println("interface1 print");

	}

	@Override
	public void nestedprint() {
		System.out.println("nested interface print");

	}

}
