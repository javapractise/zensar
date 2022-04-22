package vinayteat8;

public class CustomWrapperClass {
		private int value;  

		CustomWrapperClass(){}  

		CustomWrapperClass(int value){  
		this.value = value;  
		} 
		public int getValue(){  
		return value;  
		}  
		public void setValue(int value){  
		this.value = value;  
		}   
		public String toString() {  
		  return Integer.toString(value);  
		}   
		} 
class Sample{  
		    
			public static void main(String[] args){ 
			    
				CustomWrapperClass value1=new CustomWrapperClass(25);  

			System.out.println("value1 - "+value1);  

			}
			}  