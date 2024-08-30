package com.prowings.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitionExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(-2,-1,0,1,2,3,4);
		
		List<Predicate<Integer>> predicates = Arrays.asList(

				n -> n % 2 == 0, //predicate 1: is even
				n -> n > 0       //predicate 2: is positive
				
				);
		
		List<List<Integer>> partioned = predicates.stream()
												  .map(pred -> numbers.stream().filter(pred).collect(Collectors.toList()))
												  .collect(Collectors.toList());
		
		partioned.forEach(System.out::println);
		
	}
	
}
