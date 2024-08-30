package com.prowings.java8;

public class SplittheWord {

	public static void main(String[] args) {
		
		String str = "India is My Country";
		
		String[] split = str.split(" ");
		
		for(int i=split.length-1; i>=0; i--) {
			
			System.out.print(split[i]);
		}
	}
	
}
