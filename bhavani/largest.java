package array;

public class Largest {
	
	public static int getLargest(int[] a, int total){
	int temp;  
	for (int i = 0; i < total; i++)   
	        {  
	            for (int j = i + 1; j < total; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
	       return a[total-1];  
	}  

}
package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Length {

	@Test
	void   getLargest() {
		
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		  
		}}  
			
