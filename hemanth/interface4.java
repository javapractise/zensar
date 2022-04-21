package mainpractice;

public interface vehicle {
	public void model();
		default public void name() {
			System.out.println("bike");
		
	}

}




package mainpractice;

public class main implements vehicle {

	


	public void model() {
		
		System.out.println("pulsar");
	}

}



package mainpractice;

public class main1 {

	public static void main(String[] args) {
		vehicle obj=new main();
		obj.model();
		

	}

}