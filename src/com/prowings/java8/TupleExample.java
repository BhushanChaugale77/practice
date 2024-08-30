package com.prowings.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TupleExample {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		
		List<String> list2 = Arrays.asList("a","b","c","d","e","f","g");
		
	
Stream<Tuple<Integer, String>> tuplestream = IntStream.range(0, Math.min(list1.size(), list2.size()))
												      .mapToObj(i -> new Tuple<>(list1.get(i), list2.get(i)));
		

		tuplestream.forEach(System.out::println);
	}
}
	class Tuple<X, Y> {
	    public final X first;
	    public final Y second;

	    public Tuple(X first, Y second) {
	        this.first = first;
	        this.second = second;
	    }

	    @Override
	    public String toString() {
	        return "(" + first + ", " + second + ")";
	    }
	
	
	}


