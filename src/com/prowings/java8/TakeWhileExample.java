package com.prowings.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileExample {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,2,4,1,5);
		
		List<Integer> takenList = numbers.stream()
										 .takeWhile(n -> n < 3)
										 .collect(Collectors.toList());
		System.out.println(takenList);
	}
	
}
