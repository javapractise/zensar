import java.util.Scanner;

class TaxiRide
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int mat[][] = new int[n][m];
		
		for(int i=0 ; i<n; i++)
		{
			for(int j=0 ; j<m ; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		int person = 0;
		for(int i=0 ; i<n; i++)
		{
			for(int j=0 ; j<m ; j++)
			{
				if(mat[i][j]==1)
				{	person++;	}
			}
		}
		
		System.out.println("Number of person that we picked up : "+person);
		
	}
}