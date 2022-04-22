public class DuplicateElements{
public static void main(String args[]){
int[] arr = new int[]{1,2,3,4,5,6,7};
System.out.println("Duplicate elements in given array:");
for(int i=0;i<arr.length;i++){
for(int j=i;j<arr.length;j++){
if(arr[i] == arr[j])
System.out.println(arr[j]);
}
}
}
} 