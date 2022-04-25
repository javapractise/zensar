// Anonymous Inner classes

import java.util.*;

class Demo {

	void show()
	{
		System.out.println(
			"This is show method of super class");
	}
}

class Anonymous {

	static Demo d = new Demo() {
		void show()
		{
			super.show();

			System.out.println("This is Anonymous class");
		}
	};

	public static void main(String[] args)
	{
		d.show();
	}
}
