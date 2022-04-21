//multiple
interface Bike
{
	public void ride();
	
}

interface Car
{
	public void drive();
}

public class Person implements Bike, Car{
	public void ride()
	{
		System.out.println("riding the bike");
	}
	public void drive()
	{
		System.out.println("driving the car");
	}
	
	public static void main(String[] args)
	{
		Person p = new Person();
                    p.ride();
                    p.drive();
	}