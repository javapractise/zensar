

public class duplicate {
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50,10,20,5,9,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicte elements are:"+ a[j]);
				}
			}
		}
	}

}
