package Practice;

public class twoObjects {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,5,6};
		int b[]= {9,5,4,2,1};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count=count+1;
				}
			}
		}
		if(count==a.length)
		{
			System.out.println("both arrays are same");
		}
		else
		{
			System.out.println("both arrays are not same");
		}
	}
}


