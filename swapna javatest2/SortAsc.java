public class SortAsc
 {    
        public static void main(String[] args) 
        {
            int [] arr = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
         System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) 
       {     
            System.out.print(arr[i] + " ");    
        }       
     	for (int i = 0; i < arr.length; i++) 
	{     
                              for (int j = i+1; j < arr.length; j++) 
		{     
              		 if(arr[i] > arr[j]) {    
                 		  temp = arr[i];    
                  	 arr[i] = arr[j];    
                  	 arr[j] = temp; }   
               }                  }
          
  }     

}      

   
     