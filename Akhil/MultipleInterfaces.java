package training4;

interface Fish {
	public void getFish();
}

interface Tiger {
	public void getTiger();
}

class Animals implements Fish, Tiger {

	public void getFish() {
		System.out.println("This is dog");
	}
	
	public void getTiger() {
		System.out.println("This is Tiger");
	}
}


public class MultipleInterfaces{

	public static void main(String[] args) {
		
		Animals a = new Animals();
		
		a.getFish();
		a.getTiger();

	}

}
