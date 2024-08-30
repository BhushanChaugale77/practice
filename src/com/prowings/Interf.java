package com.prowings;

interface Interf {

	  static void m1() {
		
		System.out.println(">>>>>Static method<<<<<<<<");
	}
	  
	  public static void main(String[] args) {
		
		  m1();
		  Interf.m1();
		 
	}
	
}

