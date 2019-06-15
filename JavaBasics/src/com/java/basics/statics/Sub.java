package com.java.basics.statics;

public class Sub extends Super {
	
	static void method(){	   
		System.out.println("Sub class method");
	}

	public static void main(String[] args) {
		Sub.method();
		Super.method();
		
		method();
	}

}
