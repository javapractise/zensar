// Multiple Inheritance

import java.util*;
import java.util.lang;

interface Bike{
	public void ride();
	
}

interface Car{
	public void drive();
}

public class Person implements Bike, Car{
	public void ride()
	{
		System.out.println("I am riding the bike");
	}
	public void drive()
	{
		System.out.println("I am driving the car");
	}
	
	public static void main(String[] args)
	{
		Person p = new Person();
                    p.ride();
                    p.drive();
	}