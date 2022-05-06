package com.java.java8feature.stream.stream1;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
int arr[] = {1,2,3,4,4,5};
 IntStream.of(2,3,4,56,7).forEach(System.out::println);
 IntStream stream=IntStream.of(arr);
  long countt =stream.count();
  System.out.println(countt);
  System.out.println();
  IntStream.range(1, 20).forEach(System.out::println);
 
	DoubleStream.of(3, 4, 1, 3).forEach(System.out::println);

  

	}

}
