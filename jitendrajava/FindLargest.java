public class FindLargest
{
public static void main(String args[])
{
int[] a={10,20,40,50,60};
int large=a[0];
for(int i=1; i<a.length;i++)
{
if(large<a[i])
{
large=a[i];
}
}
System.out.println("largest element is "+large);
}
}
