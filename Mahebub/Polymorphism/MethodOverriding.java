package com.zensar.polymorphism;

public class MethodOverriding {
	String color = "Red";
	String run = "Fastly";
	
	public void animal() {
		System.out.println("animals have different colours and they run slow or fast");
	}
}

class Child extends MethodOverriding {
	public void tiger() {
		System.out.println("Tiger have "+color+" colour and he runs very "+run);
	}
}

class Test2 {
	public static void main(String[] args) {
		Child c = new Child();	
		c.tiger();
	}
}