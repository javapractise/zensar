package project1;




public class Taxi {
	
public static void main(String[] args) {
	int passenger=0;
	int[][] matrix = { { 0, 1, -1 }, { 1, 0, -1 }, { 1, 1, 1 },

	};
	for(int i=0;i<matrix.length;i++)
	{
		for(int j =0;j<matrix[i].length;j++)
		{
			
					if(matrix[i][j] != -1) {
						passenger += matrix[i][j];
					}
				}
			}
		System.out.println(passenger);
	}

	
}



}