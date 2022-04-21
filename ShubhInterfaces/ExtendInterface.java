//Extend Interface

import java.util*;
import java.util.lang;

interface films{
	public void watch();
}

interface Director extends films{
	public void direct();
	
}

class Competition implements Director{
	public void watch()
	{
		System.out.println("I am Watching Films");
	}
	public void direct()
	{
		System.out.println("I am Directing films");
	}
	
}