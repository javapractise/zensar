
import java.util.Scanner;
public class car {
	public static void main(String[] args)
	{
		int m,n,i,j;
		int people=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		m=sc.nextInt();
		System.out.println("Enter the number of coloums:");
		n=sc.nextInt();
		
		int mat[][]=new int[m][n];
		System.out.println("Enter the Elements of matrix are:");
		for( i=0;i<m;i++)
		{
			for( j=0;j<n;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements of the matrix are");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                System.out.print(mat[i][j] + "  ");
            System.out.println();
        }
        
        for(i=0;i<mat.length;i++)
        {
        	for(j=0;j<m;j++)
        	{
        		if(mat[i][j]==1)
        		{
        			people=people+1;
        		}
        		
        	}
        }
        System.out.println("maximum number of passingers is:"+people);
	}
}
