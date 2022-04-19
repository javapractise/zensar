
public class largest {
	public static void main(String[] args)
	{
		int a[]= {12,17,9,3,5};
		int max=9;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("the largest number in array is :" + max);

	}

}
