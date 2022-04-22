package vinayteat8;

import java.util.ArrayList;

public class Unboxing {
	public static void main(String[] args)
		{
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(100); // autoboxing int to Integer
			arrayList.add(200);
			arrayList.add(300);
			for(Integer i : arrayList) {
				System.out.println(i);
			}
		}
}