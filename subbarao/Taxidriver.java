package training1;

public class Taxidrivar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int passengers = 0;
		int[][] path = {
				{0, 1, -1},
				{1, 0, -1},
				{1, 1, 1},

		};

		for(int i=0; i<path.length; i++) {
			for(int j=0; j<path[i].length; j++) {
				if(path[i][j] != -1) {
					passengers += path[i][j];
				}
			}
		}

		System.out.println(passengers);



	}

}