import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Filter
{
public static void main(String args[])
{
List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8);
Predicate<Integer>condition=new Predicate<Integer>()
{
public boolean test(Integer i)
{
if(i%2==0)
{
return true;
}
return false;
}
};
list.stream().filter(condition).forEach(System.out::println);
}
}