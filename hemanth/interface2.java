package mainpractice;

public interface vehicle {
	public void model();
	interface bike{
		public void name();
		
	}

}



package mainpractice;

public class main implements vehicle {

	public static void main(String[] args) {
		main obj=new main();
		obj.model();

	}


	public void model() {
		
		System.out.println("bike");
	}

}