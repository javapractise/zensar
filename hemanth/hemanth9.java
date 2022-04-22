package javapractice;

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

public class test1 {

	public static void main(String[] args) {

		Wrapper j = new Wrapper();
		j.setValue(10);
		System.out.println(w.getValue());
		j.toString();
		System.out.println(j.getValue());


	}

}