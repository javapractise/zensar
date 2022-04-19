
public class sort {
	public static void main(String[] args)
	{
		int a[]= {7,9,10,2,4,21,0,83};
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			b[i]=a[i];
		}
		System.out.print("Before sorting the array");
		for (int l=0;l<a.length;l++)
		{
			System.out.print(a[l]+",");
		}
		System.out.print("After sorting the array");
		for (int k=0;k<a.length;k++)
		{
			System.out.print(b[k]+",");
		}
		
	}

}
