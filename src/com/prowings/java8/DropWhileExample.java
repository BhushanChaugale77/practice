package com.prowings.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DropWhileExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,2,4,1,5);
		
							List<Integer> dropedList = numbers.stream()
								   .dropWhile(n -> n < 3)
								   .collect(Collectors.toList());
							
							System.out.println(dropedList);
							
		
	}
	
	
}
