package extendedinterface;

public interface twowheeler {
	public void drive();
	default public void tyres()
	{
		System.out.println("no.of tyres");
	}

}




package extendedinterface;

public class main1 {

	public static void main(String[] args) {
		twowheeler obj=new main();
		obj.drive();
	
	}

	
	
	}



package extendedinterface;

public class main implements twowheeler{

	public void drive() {
		System.out.println("through steering");
		
	}

}
