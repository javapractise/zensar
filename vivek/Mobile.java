//class to interface
interface Charger{
	public void charge();
}

class Mobile implements Charger{
	public void charge( )
	{	System.out.println("Charging.....");	}

	public static void main(String[] args)
	{
		Mobile m = new Mobile();
		m.charge();
	}
}