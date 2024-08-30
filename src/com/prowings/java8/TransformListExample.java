package com.prowings.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformListExample {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple","banana","Chery");
		
		List<String> transformedList = words.stream()
											.map(word -> "prefix_" +word)
											.collect(Collectors.toList());
		
		transformedList.forEach(System.out::println);
		
		
		
	}
	
	
}
