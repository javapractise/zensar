package project1;


interface Moveable
{
 	int avg_SPEED = 40;
 	void move();
}

class Vehicle implements Moveable
{
 	public void move()
 	{
  		System.out.println("Average speed is"+avg_SPEED);
 	}
 	public static void main (String[] arg)
 	{
  		Vehicle vc = new Vehicle();
  		vc.move();
 	}
}