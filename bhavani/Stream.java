import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;

import java.util.stream.FloatStream;
class Stream
{
public static void main(String args[])
{
IntStream stream = IntStream.of(2,4,6,8,10);
DoubleStream stream1=stream.mapToDouble(num->(double)num);

stream1.forEach(System.out::println);
}
}
