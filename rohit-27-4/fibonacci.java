

public class fibonacci {
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int temp=0;
		int n=10;
		int arr[]= new int[n]; 
		for(int i=2;i<n;++i)
		{
			temp=a+b;
			a=b;
			b=temp;
			arr[i]=temp;
		}
		for(int i=n-1;i>=2;--i)
		{
			System.out.println(arr[i]);
		}
		System.out.println(1);
		System.out.println(0);
	}

}
