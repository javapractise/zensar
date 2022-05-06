package demo;

public class ArrayMax {
	public int max()
	{
	int[] a = new int[] { 22, 3, 550, 4, 11, 100};
	int max = a[0];
	for(int i = 1; i < a.length;i++) { if(a[i] > max)
	{
		max = a[i];
	}
	}
	
	return max;
	}

}


