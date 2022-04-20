public class Average{

public static void main (String args[]){

		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		float sum = 0;
		int i=0;
		while(i<nums.length){
		sum += nums[i];
		i++;
		}
		float average = (sum /nums.length);
		System.out.println("Average : "+average);
		
	}
		
}

