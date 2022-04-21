package Training;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		int passenger=0;
                 int m,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  rows:");
		m=sc.nextInt();
		System.out.println("Enter  coloums:");
		n=sc.nextInt();

		int peo[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for( int j=0;j<n;j++)
			{
				peo[i][j] = sc.nextInt();
			}
		}
                  for (int i = 0; i < m; i++)
                  {
                   for (int j = 0; j < n; j++)
                  System.out.print(peo[i][j] + "  ");
                  System.out.println();
             }

                          for(i=0;i<peo.length;i++)
                          {
        	           for(j=0;j<m;j++)
        	          {
        		if(peo[i][j]!=-1 && peo[i][j]!=0)
        		{
        			passenger=passenger+peo[i][j];
        		}

        	}
        }
        System.out.println("maximum number is:"+passenger);
	}
}