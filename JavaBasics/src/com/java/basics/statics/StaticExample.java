package com.java.basics.statics;

public class StaticExample {

	static {
		System.out.println("Print static");
	}
	
	public static void print() {
		System.out.println("Print basics");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		print();
	}
}
