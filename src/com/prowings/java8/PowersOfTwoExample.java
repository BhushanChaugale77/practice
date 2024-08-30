package com.prowings.java8;

import java.util.stream.Stream;

public class PowersOfTwoExample {

	public static void main(String[] args) {
		
	Stream<Double> powersOfTwo = Stream.iterate(1.0, n -> n *2)
									  .limit(10);

		powersOfTwo.forEach(System.out::println);
	
	}

}