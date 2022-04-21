package Interface;

interface animal{
	public void watch();
}

interface Director extends animal{
	public void direct();

}

class Competition implements Director{
	public void watch()
	{
		System.out.println("watching the movies");
	}
	public void direct()
	{
		System.out.println("directing movies");
	}

}