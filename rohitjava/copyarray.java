
public class copyarray {
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50};
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for (int j=0;j<a.length;j++)
		{
			System.out.print(b[j]+",");
		}
	}

}
