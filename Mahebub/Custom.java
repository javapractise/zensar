package stirngpractice;

public class Custom {
	private int i;

	public Custom(int i) {
		this.i = i;
	}

	public String toString() {
		return Integer.toString(i);
	}
}

class Test1 {
	public static void main(String[] args) {
		Custom c = new Custom(10);
		System.out.println(c);
	}
}