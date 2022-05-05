package streams;



import java.util.Scanner;



public class maxval {



public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[] arr=new String[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.next();
}
for(int i=0;i<arr.length;i++)
{
arr[i].chars().mapToObj(s->String.valueOf((char)s)).findFirst().ifPresent(System.out::print);
}



}



}