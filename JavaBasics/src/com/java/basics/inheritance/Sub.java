package com.java.basics.inheritance;

public class Sub extends Super {

	public void method() {
		System.out.println("Pring Sub");
	}
	
	public static void main(String[] args) {
		Super s = new Sub(); 
		s.method();
		
		Super s1 = new Super(); 
		s1.method();
		
		Sub s2 = new Sub();
		s2.method();
	}
}
