class Wrapper {

	private int i;

	public void setValue(int i) {
		this.i = i;
	}

	public int getValue() {
		return i;
	}

	public String toString() {
		return Integer.toString(i);
	}
}
public class wrapper{

	public static void main(String[] args) {

		Wrapper w = new Wrapper();
		w.setValue(88);
		System.out.println(w.getValue());
		w.toString();
		System.out.println(w.getValue());


	}

}